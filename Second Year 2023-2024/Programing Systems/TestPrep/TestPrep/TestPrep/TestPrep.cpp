// TestPrep.cpp : Defines the entry point for the application.
//

#include "framework.h"
#include "TestPrep.h"
#include "strsafe.h"
#include <string>

#define MAX_LOADSTRING 100

// Global Variables:
HINSTANCE hInst;                                // current instance
WCHAR szTitle[MAX_LOADSTRING];                  // The title bar text
WCHAR szWindowClass[MAX_LOADSTRING];            // the main window class name

// Forward declarations of functions included in this code module:
ATOM                MyRegisterClass(HINSTANCE hInstance);
BOOL                InitInstance(HINSTANCE, int);
LRESULT CALLBACK    WndProc(HWND, UINT, WPARAM, LPARAM);
INT_PTR CALLBACK    About(HWND, UINT, WPARAM, LPARAM);
INT_PTR CALLBACK    MyFirstProc(HWND, UINT, WPARAM, LPARAM);

int APIENTRY wWinMain(_In_ HINSTANCE hInstance,
                     _In_opt_ HINSTANCE hPrevInstance,
                     _In_ LPWSTR    lpCmdLine,
                     _In_ int       nCmdShow)
{
    UNREFERENCED_PARAMETER(hPrevInstance);
    UNREFERENCED_PARAMETER(lpCmdLine);

    // TODO: Place code here.

    // Initialize global strings
    LoadStringW(hInstance, IDS_APP_TITLE, szTitle, MAX_LOADSTRING);
    LoadStringW(hInstance, IDC_TESTPREP, szWindowClass, MAX_LOADSTRING);
    MyRegisterClass(hInstance);

    // Perform application initialization:
    if (!InitInstance (hInstance, nCmdShow))
    {
        return FALSE;
    }

    HACCEL hAccelTable = LoadAccelerators(hInstance, MAKEINTRESOURCE(IDR_ACCELERATOR1));

    MSG msg;

    // Main message loop:
    while (GetMessage(&msg, nullptr, 0, 0))
    {
        if (!TranslateAccelerator(msg.hwnd, hAccelTable, &msg))
        {
            TranslateMessage(&msg);
            DispatchMessage(&msg);
        }
    }

    return (int) msg.wParam;
}



//
//  FUNCTION: MyRegisterClass()
//
//  PURPOSE: Registers the window class.
//
ATOM MyRegisterClass(HINSTANCE hInstance)
{
    WNDCLASSEXW wcex;

    wcex.cbSize = sizeof(WNDCLASSEX);

    wcex.style          = CS_HREDRAW | CS_VREDRAW;
    wcex.lpfnWndProc    = WndProc;
    wcex.cbClsExtra     = 0;
    wcex.cbWndExtra     = 0;
    wcex.hInstance      = hInstance;
    wcex.hIcon          = LoadIcon(hInstance, MAKEINTRESOURCE(IDI_TESTPREP));
    wcex.hCursor        = LoadCursor(nullptr, IDC_ARROW);
    wcex.hbrBackground  = (HBRUSH)(COLOR_WINDOW+1);
    wcex.lpszMenuName   = MAKEINTRESOURCEW(IDC_TESTPREP);
    wcex.lpszClassName  = szWindowClass;
    wcex.hIconSm        = LoadIcon(wcex.hInstance, MAKEINTRESOURCE(IDI_SMALL));

    return RegisterClassExW(&wcex);
}

//
//   FUNCTION: InitInstance(HINSTANCE, int)
//
//   PURPOSE: Saves instance handle and creates main window
//
//   COMMENTS:
//
//        In this function, we save the instance handle in a global variable and
//        create and display the main program window.
//
BOOL InitInstance(HINSTANCE hInstance, int nCmdShow)
{
   hInst = hInstance; // Store instance handle in our global variable

   HWND hWnd = CreateWindowW(szWindowClass, szTitle, WS_OVERLAPPEDWINDOW,
      CW_USEDEFAULT, 0, CW_USEDEFAULT, 0, nullptr, nullptr, hInstance, nullptr);

   if (!hWnd)
   {
      return FALSE;
   }

   ShowWindow(hWnd, nCmdShow);
   UpdateWindow(hWnd);

   return TRUE;
}

//
//  FUNCTION: WndProc(HWND, UINT, WPARAM, LPARAM)
//
//  PURPOSE: Processes messages for the main window.
//
//  WM_COMMAND  - process the application menu
//  WM_PAINT    - Paint the main window
//  WM_DESTROY  - post a quit message and return
//
//
LRESULT CALLBACK WndProc(HWND hWnd, UINT message, WPARAM wParam, LPARAM lParam)
{
    switch (message)
    {
    case WM_COMMAND:
        {
            int wmId = LOWORD(wParam);
            // Parse the menu selections:
            switch (wmId)
            {
            case ID_MENU_ITEM_MYFIRSTOPTION:
                DialogBox(hInst, MAKEINTRESOURCE(IDD_DLG_MYFIRST), hWnd, About);
                break;
            case ID_FILE_MYFIRSTDIALOG:
                DialogBox(hInst, MAKEINTRESOURCE(IDD_DLG_MYFIRST), hWnd, MyFirstProc);
                break;
            case IDM_ABOUT:
                DialogBox(hInst, MAKEINTRESOURCE(IDD_ABOUTBOX), hWnd, About);
                break;
            case IDM_EXIT:
                DestroyWindow(hWnd);
                break;
            default:
                return DefWindowProc(hWnd, message, wParam, lParam);
            }
        }
        break;
    case WM_PAINT:
        {
            PAINTSTRUCT ps;
            HDC hdc = BeginPaint(hWnd, &ps);
            // TODO: Add any drawing code that uses hdc here...
            EndPaint(hWnd, &ps);
        }
        break;
    case WM_DESTROY:
        PostQuitMessage(0);
        break;
    default:
        return DefWindowProc(hWnd, message, wParam, lParam);
    }
    return 0;
}

// Message handler for about box.
INT_PTR CALLBACK About(HWND hDlg, UINT message, WPARAM wParam, LPARAM lParam)
{
    UNREFERENCED_PARAMETER(lParam);
    switch (message)
    {
    case WM_INITDIALOG:
        return (INT_PTR)TRUE;

    case WM_COMMAND:
        if (LOWORD(wParam) == IDOK || LOWORD(wParam) == IDCANCEL)
        {
            int iMsgBox = MessageBox(NULL,
                L"Do you really want to exit?\nPlease, confirm",
                L"About exit...",
                MB_ICONEXCLAMATION | MB_YESNO);
            if (iMsgBox == IDYES)
                EndDialog(hDlg, LOWORD(wParam));
            return (INT_PTR)TRUE;
        }
        break;
    }
    return (INT_PTR)FALSE;
}


INT_PTR CALLBACK MyFirstProc(HWND hDlg, UINT message, WPARAM wParam, LPARAM lParam)
{
    UINT status;
    WCHAR szText[MAX_LOADSTRING];
    int intVal;
    BOOL bSigned, bSuccess;
    double dVal;
    std::string::size_type sz;

    UNREFERENCED_PARAMETER(lParam);
    switch (message)
    {
    case WM_INITDIALOG:
        //3. Инициализация, поставяне и получаване на стойности :
        //a.При стартиране на диалога и поставяне на стойност за бутони : CheckDlgButton
        CheckDlgButton(hDlg, IDC_BTN_CHECKEGN, BST_CHECKED);
        CheckDlgButton(hDlg, IDC_RADIO_FEMALE, BST_CHECKED);
        CheckDlgButton(hDlg, IDC_CHECK_HIDDEN, BST_CHECKED);
        CheckDlgButton(hDlg, IDC_RADIO_CHILD, BST_CHECKED);
        CheckDlgButton(hDlg, IDC_RADIO_ADULT, BST_CHECKED);

        SetFocus(GetDlgItem(hDlg, IDC_BTN_CHECKEGN));

        return (INT_PTR)TRUE;
    case WM_COMMAND:
        int wmId = LOWORD(wParam);
        switch (wmId)
        {
        //2. Обработка на съобщение за натиснат бутон
        case IDC_BTN_CHECKEGN:
            MessageBox(hDlg, L"\"Check EGN\" button is pressed", L"Info", MB_OK);
        
        //c.Проверка на статус и установяване на радиобутон : IsDlgButtonChecked, CheckRadioButton
            if (IsDlgButtonChecked(hDlg, IDC_RADIO_MALE) == BST_CHECKED)
                CheckRadioButton(hDlg, IDC_RADIO_MALE, IDC_RADIO_FEMALE,
                    IDC_RADIO_FEMALE);
            else
                CheckRadioButton(hDlg, IDC_RADIO_MALE, IDC_RADIO_FEMALE,
                    IDC_RADIO_MALE);
            //g. Извличане на текст-стринг: GetDlgItemText
            if (!GetDlgItemText(hDlg, IDC_EDIT_EGN, szText, MAX_LOADSTRING))
                *szText = 0;
            MessageBox(hDlg, szText, L"Info", MB_OK);

            // requires #include "strsafe.h"
            bSigned = IsDlgButtonChecked(hDlg, IDC_CHECK_HIDDEN);
            intVal = GetDlgItemInt(hDlg, IDC_EDIT_EGN, &bSuccess, bSigned);
            if (!bSuccess)
            {
                MessageBox(hDlg, L"Error to extract integer value", L"Error!", MB_OK);
                SetFocus(GetDlgItem(hDlg, IDC_EDIT_EGN));
            }
            else
            {
                StringCbPrintf(szText, ARRAYSIZE(szText),
                    L"The value is \"%i\"", intVal);
                MessageBox(hDlg, szText, L"Done!", MB_OK);
            }

            try {
                if (!GetDlgItemText(hDlg, IDC_EDIT_EGN, szText, MAX_LOADSTRING))
                    *szText = 0;
                dVal = std::stod(szText, &sz);
                StringCbPrintf(szText, ARRAYSIZE(szText), L"The value is \"%f\"",
                    dVal);
                MessageBox(hDlg, szText, L"Done!", MB_OK);
            }
            catch (std::exception& e) {
                MessageBox(hDlg, L"Error to extract double value", L"Error!",
                    MB_ICONERROR | MB_OK);
                dVal = 0.0;
            }
            return (INT_PTR)TRUE;


            return (INT_PTR)TRUE;
        case IDC_RADIO_ADULT:
        case IDC_RADIO_CHILD:
            SetDlgItemInt(hDlg, IDC_EDIT_EGN, IsDlgButtonChecked(hDlg, IDC_RADIO_ADULT),
                FALSE);
            return (INT_PTR)TRUE;
        case IDC_CHECK_HIDDEN:
            status = IsDlgButtonChecked(hDlg, IDC_CHECK_HIDDEN);
            StringCbPrintf(szText, ARRAYSIZE(szText), L"Checkbox Hidden is %s",
                status == BST_CHECKED ? L"\"Checked\"" : L"\"Unchecked\"");
            SetDlgItemText(hDlg, IDC_EDIT_EGN, szText);
            return (INT_PTR)TRUE;
        case IDOK:
        case IDCANCEL:
            EndDialog(hDlg, LOWORD(wParam));
            return (INT_PTR)TRUE;
            break;
        }
    }
    return (INT_PTR)FALSE;
}