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

        // Define the coordinates of the square's corners
        int x1 = 120, y1 = 100; // Top-left corner
        int x2 = 220, y2 = 100; // Top-right corner
        int x3 = 200, y3 = 200; // Bottom-right corner
        int x4 = 100, y4 = 200; // Bottom-left corner

        // Draw the first square
        MoveToEx(hdc, x1, y1, NULL);
        LineTo(hdc, x2, y2); // Draw top side
        LineTo(hdc, x3, y3); // Draw right side
        LineTo(hdc, x4, y4); // Draw bottom side
        LineTo(hdc, x1, y1); // Draw left side

        // Define the coordinates of the second square's corners
        int x5 = 80, y5 = 50;  // Top-left corner
        int x6 = 120, y6 = 100; // Top-right corner
        int x7 = 100, y7 = 200; // Bottom-right corner
        int x8 = 60, y8 = 150;   // Bottom-left corner

        // Draw the second square
        MoveToEx(hdc, x5, y5, NULL);
        LineTo(hdc, x6, y6); // Draw top side
        LineTo(hdc, x7, y7); // Draw right side
        LineTo(hdc, x8, y8); // Draw bottom side
        LineTo(hdc, x5, y5); // Draw left side

        // Define the coordinates of the third square's corners
        int x9 = 220, y9 = 100;  // Top-left corner
        int x10 = 320, y10 = 100; // Top-right corner
        int x11 = 300, y11 = 200; // Bottom-right corner
        int x12 = 200, y12 = 200; // Bottom-left corner

        // Draw the third square
        MoveToEx(hdc, x9, y9, NULL);
        LineTo(hdc, x10, y10); // Draw top side
        LineTo(hdc, x11, y11); // Draw right side
        LineTo(hdc, x12, y12); // Draw bottom side
        LineTo(hdc, x9, y9);   // Draw left side

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


INT_PTR CALLBACK MyF(HWND hDlg, UINT message, WPARAM wParam, LPARAM lParam)
{
    UNREFERENCED_PARAMETER(lParam);
    static UINT_PTR nTimerID = 0;
    static int iProgress = 10; // Initialize progress to 10

    switch (message)
    {
    case WM_INITDIALOG:
        // Set the range of the progress control to 0-10
        SendDlgItemMessage(hDlg, IDC_PROGRESS1, PBM_SETRANGE32, 0, 10);

        // Set the initial position of the progress control to 10 (full)
        SendDlgItemMessage(hDlg, IDC_PROGRESS1, PBM_SETPOS, 10, 0);
        return (INT_PTR)TRUE;

    case WM_COMMAND:
    {
        int wmId = LOWORD(wParam);
        switch (wmId)
        {
        case IDC_BUTTON4: // Start timer
            if (nTimerID == 0) // If timer is not already running
            {
                nTimerID = SetTimer(hDlg, 1, 1000, NULL); // Start the timer for 1 sec interval
            }
            break;

        case IDC_BUTTON5: // Stop timer
            if (nTimerID != 0) // If the timer is running
            {
                KillTimer(hDlg, nTimerID); // Stop the timer
                nTimerID = 0; // Reset the timer ID
            }
            break;
        }
        break;
    }
    case WM_TIMER:
    {
        if (wParam == 1) // If the timer ID matches
        {
            // Decrease progress
            iProgress--;
            if (iProgress < 0) // Ensure progress doesn't go below 0
                iProgress = 0;

            // Update progress bar
            HWND hProgressBar = GetDlgItem(hDlg, IDC_PROGRESS1);
            SendMessage(hProgressBar, PBM_SETPOS, iProgress, 0);

            // Check if the timer has reached 0
            if (iProgress == 0)
            {
                KillTimer(hDlg, nTimerID); // Stop the timer
                nTimerID = 0; // Reset the timer ID
            }
        }
        break;
    }
    case WM_DESTROY:
        // Make sure to clean up the timer when the dialog is destroyed
        if (nTimerID != 0)
        {
            KillTimer(hDlg, nTimerID);
            nTimerID = 0;
        }
        break;
    case WM_CLOSE:
        EndDialog(hDlg, 0); // Close the dialog box
        break;
    }
    return (INT_PTR)FALSE;
}
