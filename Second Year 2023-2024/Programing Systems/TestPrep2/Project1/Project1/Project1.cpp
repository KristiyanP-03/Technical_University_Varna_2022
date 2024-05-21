// Project1.cpp : Defines the entry point for the application.
//

#include "framework.h"
#include "Project1.h"
#include "commctrl.h"

// Глобални променливи:
int iProgress = 100; // Начална стойност на прогреса (100%)
UINT_PTR nTimerID = 0; // ID на таймера
const int TIMER_INTERVAL = 5000; // Интервал на таймера (в милисекунди)


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
INT_PTR CALLBACK    MyF(HWND, UINT, WPARAM, LPARAM);
INT_PTR CALLBACK    Tst(HWND, UINT, WPARAM, LPARAM);

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
    LoadStringW(hInstance, IDC_PROJECT1, szWindowClass, MAX_LOADSTRING);
    MyRegisterClass(hInstance);

    // Perform application initialization:
    if (!InitInstance (hInstance, nCmdShow))
    {
        return FALSE;
    }

    HACCEL hAccelTable = LoadAccelerators(hInstance, MAKEINTRESOURCE(IDC_PROJECT1));

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
    wcex.hIcon          = LoadIcon(hInstance, MAKEINTRESOURCE(IDI_PROJECT1));
    wcex.hCursor        = LoadCursor(nullptr, IDC_ARROW);
    wcex.hbrBackground  = (HBRUSH)(COLOR_WINDOW+1);
    wcex.lpszMenuName   = MAKEINTRESOURCEW(IDC_PROJECT1);
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
            case IDM_ABOUT:
                DialogBox(hInst, MAKEINTRESOURCE(IDD_ABOUTBOX), hWnd, About);
                break;
            case ID_NEW_DI:
                DialogBox(hInst, MAKEINTRESOURCE(IDD_DIALOG1), hWnd, MyF);
                break;
            case ID_TEST_TEST:
                DialogBox(hInst, MAKEINTRESOURCE(IDD_DIALOG2), hWnd, Tst);
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


        int x1 = 120, y1 = 100; 
        int x2 = 220, y2 = 100; 
        int x3 = 200, y3 = 200; 
        int x4 = 100, y4 = 200; 


        MoveToEx(hdc, x1, y1, NULL);
        LineTo(hdc, x2, y2);
        LineTo(hdc, x3, y3); 
        LineTo(hdc, x4, y4);
        LineTo(hdc, x1, y1); 

 
        int x5 = 80, y5 = 50;  
        int x6 = 120, y6 = 100; 
        int x7 = 100, y7 = 200;
        int x8 = 60, y8 = 150;   


        MoveToEx(hdc, x5, y5, NULL);
        LineTo(hdc, x6, y6);
        LineTo(hdc, x7, y7); 
        LineTo(hdc, x8, y8); 
        LineTo(hdc, x5, y5); 


        int x9 = 220, y9 = 100;  
        int x10 = 280, y10 = 60; 
        int x11 = 270, y11 = 150;
        int x12 = 200, y12 = 200;


        MoveToEx(hdc, x9, y9, NULL);
        LineTo(hdc, x10, y10);
        LineTo(hdc, x11, y11); 
        LineTo(hdc, x12, y12);
        LineTo(hdc, x9, y9);

        MoveToEx(hdc, x5, y5, NULL);
        LineTo(hdc, 180, 30);
        LineTo(hdc, x10, y10);

        HPEN hPen = CreatePen(PS_DOT, 1, RGB(0, 0, 0));
        HPEN hOldPen = (HPEN)SelectObject(hdc, hPen);

        MoveToEx(hdc, 180, 30, NULL);
        LineTo(hdc, 170, 120);

        MoveToEx(hdc, 170, 120, NULL);
        LineTo(hdc, x8, y8);

        MoveToEx(hdc, 170, 120, NULL);
        LineTo(hdc, x11, y11);


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
            EndDialog(hDlg, LOWORD(wParam));
            return (INT_PTR)TRUE;
        }
        break;
    }
    return (INT_PTR)FALSE;
}

INT_PTR CALLBACK Tst(HWND hDlg, UINT message, WPARAM wParam, LPARAM lParam)
{
    UNREFERENCED_PARAMETER(lParam);
    switch (message)
    {
    case WM_INITDIALOG:
        return (INT_PTR)TRUE;

    case WM_COMMAND: {
        int wmId = LOWORD(wParam);
        int index;
        WCHAR szText[MAX_LOADSTRING];
        WCHAR szText2[MAX_LOADSTRING];
        WCHAR szF1[MAX_LOADSTRING];


        switch (wmId) {
        case IDC_BUTTON1: {
            BOOL bTranslated;
            GetDlgItemInt(hDlg, IDC_EDIT1, &bTranslated, TRUE);
            GetDlgItemText(hDlg, IDC_EDIT1, szText, MAX_LOADSTRING);
            if (bTranslated) {
                index = (int)SendDlgItemMessage(hDlg, IDC_LIST2, LB_FINDSTRING, (WPARAM)NULL, (LPARAM)szText);
                if (index != LB_ERR) {
                    MessageBox(hDlg, L"Number already present.", L"Error", MB_OK | MB_ICONERROR);
                }
                else {
                    SendDlgItemMessage(hDlg, IDC_LIST2, LB_INSERTSTRING, NULL, (LPARAM)szText);
                }
            }
            else
                MessageBox(hDlg, L"Please enter a valid number.", L"Error", MB_OK | MB_ICONERROR);
            break;
        }
        case IDC_BUTTON2: {
            BOOL bTranslated;
            GetDlgItemInt(hDlg, IDC_EDIT1, &bTranslated, TRUE);
            GetDlgItemText(hDlg, IDC_EDIT1, szText, MAX_LOADSTRING);
            if (bTranslated) {
                index = (int)SendDlgItemMessage(hDlg, IDC_LIST1, LB_FINDSTRING, (WPARAM)NULL, (LPARAM)szText);
                if (index != LB_ERR) {
                    MessageBox(hDlg, L"Number already present.", L"Error", MB_OK | MB_ICONERROR);
                }
                else {
                    SendDlgItemMessage(hDlg, IDC_LIST1, LB_INSERTSTRING, NULL, (LPARAM)szText);
                }
            }
            else
                MessageBox(hDlg, L"Please enter a valid number.", L"Error", MB_OK | MB_ICONERROR);
            break;
        }
        case IDC_BUTTON3: {
            index = SendDlgItemMessage(hDlg, IDC_LIST1, LB_GETCURSEL, (WPARAM)NULL, (LPARAM)NULL);
            if (index != LB_ERR) {
                index = SendDlgItemMessage(hDlg, IDC_LIST1, LB_GETTEXT, (WPARAM)index, (LPARAM)szText);
            }
            else {
                MessageBox(hDlg, L"Select an option", L"Error", MB_OK | MB_ICONERROR);
                break;
            }
            index = SendDlgItemMessage(hDlg, IDC_LIST2, LB_GETCURSEL, (WPARAM)NULL, (LPARAM)NULL);
            if (index != LB_ERR) {
                index = SendDlgItemMessage(hDlg, IDC_LIST2, LB_GETTEXT, (WPARAM)index, (LPARAM)szText2);
            }
            else {
                MessageBox(hDlg, L"Select an option", L"Error", MB_OK | MB_ICONERROR);
                break;
            }
            int F1;
            int F2 = _wtoi(szText2);
            int F3 = _wtoi(szText);

            BOOL bTranslated;

            GetDlgItemInt(hDlg, IDC_EDIT1, &bTranslated, TRUE);
            GetDlgItemText(hDlg, IDC_EDIT1, szF1, MAX_LOADSTRING);
            if (bTranslated)
                F1 = _wtoi(szF1);
            else {
                MessageBox(hDlg, L"Please enter a valid number.", L"Error", MB_OK | MB_ICONERROR);
                break;
            }
            if (IsDlgButtonChecked(hDlg, IDC_CHECK1) == BST_CHECKED && IsDlgButtonChecked(hDlg, IDC_CHECK2) == BST_CHECKED && IsDlgButtonChecked(hDlg, IDC_CHECK3) == BST_CHECKED)
                SetDlgItemInt(hDlg, IDC_EDIT2, (F1 / (F2 + F3)), TRUE);
            else
                MessageBox(hDlg, L"Check Boxes F1,F2 and F3", L"Error", MB_OK | MB_ICONERROR);
            break;
        }


        case IDOK:
        case IDCANCEL:
            EndDialog(hDlg, LOWORD(wParam));
            return (INT_PTR)TRUE;
        }
    }
    }
    return (INT_PTR)FALSE;
}

INT_PTR CALLBACK MyF(HWND hDlg, UINT message, WPARAM wParam, LPARAM lParam)
{
    UNREFERENCED_PARAMETER(lParam);
    static UINT_PTR nTimerID = 0;
    static int iProgress = 10; 

    switch (message)
    {
    case WM_INITDIALOG:

        SendDlgItemMessage(hDlg, IDC_PROGRESS1, PBM_SETRANGE32, 0, 10);


        SendDlgItemMessage(hDlg, IDC_PROGRESS1, PBM_SETPOS, 10, 0);
        return (INT_PTR)TRUE;

    case WM_COMMAND:
    {
        int wmId = LOWORD(wParam);
        switch (wmId)
        {
        case IDC_BUTTON4: 
            if (nTimerID == 0)
            {
                nTimerID = SetTimer(hDlg, 1, 1000, NULL); 
            }
            break;

        case IDC_BUTTON5: 
            if (nTimerID != 0) 
            {
                KillTimer(hDlg, nTimerID);
                nTimerID = 0;
            }
            break;
        }
        break;
    }
    case WM_TIMER:
    {
        if (wParam == 1) 
        {

            iProgress--;
            if (iProgress < 0) 
                iProgress = 0;


            HWND hProgressBar = GetDlgItem(hDlg, IDC_PROGRESS1);
            SendMessage(hProgressBar, PBM_SETPOS, iProgress, 0);


            if (iProgress == 0)
            {
                KillTimer(hDlg, nTimerID);
                nTimerID = 0;
            }
        }
        break;
    }
    case WM_DESTROY:
        if (nTimerID != 0)
        {
            KillTimer(hDlg, nTimerID);
            nTimerID = 0;
        }
        break;
    case WM_CLOSE:
        EndDialog(hDlg, 0); 
        break;
    }
    return (INT_PTR)FALSE;
}
