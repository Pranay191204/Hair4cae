package com.database.hair4ce;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.material.components.BuildConfig;
import com.material.components.R;
import com.material.components.activity.about.AboutApp;
import com.material.components.activity.about.AboutAppSimple;
import com.material.components.activity.about.AboutAppSimpleBlue;
import com.material.components.activity.about.AboutCompany;
import com.material.components.activity.about.AboutCompanyCard;
import com.material.components.activity.about.AboutCompanyImage;
import com.material.components.activity.about.AboutDialogMainAction;
import com.material.components.activity.article.ArticleBigHeader;
import com.material.components.activity.article.ArticleCard;
import com.material.components.activity.article.ArticleFood;
import com.material.components.activity.article.ArticleFoodReview;
import com.material.components.activity.article.ArticleMedium;
import com.material.components.activity.article.ArticleMediumDark;
import com.material.components.activity.article.ArticleSimple;
import com.material.components.activity.article.ArticleStepper;
import com.material.components.activity.bottomnavigation.BottomNavigationBasic;
import com.material.components.activity.bottomnavigation.BottomNavigationDark;
import com.material.components.activity.bottomnavigation.BottomNavigationIcon;
import com.material.components.activity.bottomnavigation.BottomNavigationLight;
import com.material.components.activity.bottomnavigation.BottomNavigationLightSimple;
import com.material.components.activity.bottomnavigation.BottomNavigationMapBlue;
import com.material.components.activity.bottomnavigation.BottomNavigationPrimary;
import com.material.components.activity.bottomnavigation.BottomNavigationShifting;
import com.material.components.activity.bottomsheet.BottomSheetBasic;
import com.material.components.activity.bottomsheet.BottomSheetFloating;
import com.material.components.activity.bottomsheet.BottomSheetFull;
import com.material.components.activity.bottomsheet.BottomSheetList;
import com.material.components.activity.bottomsheet.BottomSheetMap;
import com.material.components.activity.button.ButtonBasic;
import com.material.components.activity.button.ButtonInUtilities;
import com.material.components.activity.button.FabMiddle;
import com.material.components.activity.button.FabMore;
import com.material.components.activity.button.FabMoreText;
import com.material.components.activity.card.CardBasic;
import com.material.components.activity.card.CardOverlap;
import com.material.components.activity.card.CardTimeline;
import com.material.components.activity.card.CardWizard;
import com.material.components.activity.card.CardWizardLight;
import com.material.components.activity.card.CardWizardOverlap;
import com.material.components.activity.chip.ChipBasic;
import com.material.components.activity.chip.ChipTag;
import com.material.components.activity.dashboard.DashboardCryptocurrency;
import com.material.components.activity.dashboard.DashboardFinance;
import com.material.components.activity.dashboard.DashboardFlight;
import com.material.components.activity.dashboard.DashboardGridFab;
import com.material.components.activity.dashboard.DashboardPayBill;
import com.material.components.activity.dashboard.DashboardStatistics;
import com.material.components.activity.dashboard.DashboardWallet;
import com.material.components.activity.dashboard.DashboardWalletGreen;
import com.material.components.activity.dialog.DialogAddPost;
import com.material.components.activity.dialog.DialogAddReview;
import com.material.components.activity.dialog.DialogBasic;
import com.material.components.activity.dialog.DialogCustom;
import com.material.components.activity.dialog.DialogCustomDark;
import com.material.components.activity.dialog.DialogCustomInfo;
import com.material.components.activity.dialog.DialogCustomLight;
import com.material.components.activity.dialog.DialogCustomWarning;
import com.material.components.activity.dialog.DialogFullscreen;
import com.material.components.activity.dialog.DialogGDPRBasic;
import com.material.components.activity.dialog.DialogHeader;
import com.material.components.activity.dialog.DialogImage;
import com.material.components.activity.dialog.DialogTermOfServices;
import com.material.components.activity.expansionpanel.ExpansionPanelBasic;
import com.material.components.activity.expansionpanel.ExpansionPanelInvoice;
import com.material.components.activity.expansionpanel.ExpansionPanelTicket;
import com.material.components.activity.form.FormAddress;
import com.material.components.activity.form.FormCheckout;
import com.material.components.activity.form.FormEcommerce;
import com.material.components.activity.form.FormLogin;
import com.material.components.activity.form.FormProfileData;
import com.material.components.activity.form.FormSignUp;
import com.material.components.activity.form.FormSignupCard;
import com.material.components.activity.form.FormSignupCardStack;
import com.material.components.activity.form.FormSignupDark;
import com.material.components.activity.form.FormSignupImage;
import com.material.components.activity.form.FormSignupImageCard;
import com.material.components.activity.form.FormSignupImageOutline;
import com.material.components.activity.form.FormTextArea;
import com.material.components.activity.form.FormWithIcon;
import com.material.components.activity.gridlist.GridAlbums;
import com.material.components.activity.gridlist.GridBasic;
import com.material.components.activity.gridlist.GridCaller;
import com.material.components.activity.gridlist.GridSectioned;
import com.material.components.activity.gridlist.GridSingleLine;
import com.material.components.activity.gridlist.GridTwoLine;
import com.material.components.activity.list.ListAnimation;
import com.material.components.activity.list.ListBasic;
import com.material.components.activity.list.ListDrag;
import com.material.components.activity.list.ListExpand;
import com.material.components.activity.list.ListMultiSelection;
import com.material.components.activity.list.ListSectioned;
import com.material.components.activity.list.ListSwipe;
import com.material.components.activity.login.LoginCardLight;
import com.material.components.activity.login.LoginCardOverlap;
import com.material.components.activity.login.LoginImageTeal;
import com.material.components.activity.login.LoginSimpleDark;
import com.material.components.activity.login.LoginSimpleGreen;
import com.material.components.activity.login.LoginSimpleLight;
import com.material.components.activity.menu.MenuDrawerMail;
import com.material.components.activity.menu.MenuDrawerNews;
import com.material.components.activity.menu.MenuDrawerNoIcon;
import com.material.components.activity.menu.MenuDrawerSimpleDark;
import com.material.components.activity.menu.MenuDrawerSimpleLight;
import com.material.components.activity.menu.MenuOverflowList;
import com.material.components.activity.menu.MenuOverflowToolbar;
import com.material.components.activity.noitem.NoItemArchived;
import com.material.components.activity.noitem.NoItemBgCactus;
import com.material.components.activity.noitem.NoItemBgCity;
import com.material.components.activity.noitem.NoItemInternetIcon;
import com.material.components.activity.noitem.NoItemInternetImage;
import com.material.components.activity.noitem.NoItemSearch;
import com.material.components.activity.noitem.NoItemTabs;
import com.material.components.activity.payment.PaymentCardCollections;
import com.material.components.activity.payment.PaymentCardDetails;
import com.material.components.activity.payment.PaymentForm;
import com.material.components.activity.payment.PaymentProfile;
import com.material.components.activity.payment.PaymentSuccessDialog;
import com.material.components.activity.picker.PickerColor;
import com.material.components.activity.picker.PickerDateDark;
import com.material.components.activity.picker.PickerDateLight;
import com.material.components.activity.picker.PickerLocation;
import com.material.components.activity.picker.PickerTimeDark;
import com.material.components.activity.picker.PickerTimeLight;
import com.material.components.activity.player.PlayerMusicAlbumCircle;
import com.material.components.activity.player.PlayerMusicAlbumDark;
import com.material.components.activity.player.PlayerMusicAlbumGrid;
import com.material.components.activity.player.PlayerMusicAlbumSimple;
import com.material.components.activity.player.PlayerMusicBasic;
import com.material.components.activity.player.PlayerMusicGenre;
import com.material.components.activity.player.PlayerMusicGenreImage;
import com.material.components.activity.player.PlayerMusicGenreLight;
import com.material.components.activity.player.PlayerMusicLight;
import com.material.components.activity.player.PlayerMusicSongList;
import com.material.components.activity.player.PlayerMusicTabs;
import com.material.components.activity.player.PlayerMusicTabsIcon;
import com.material.components.activity.player.PlayerVideoBasic;
import com.material.components.activity.player.PlayerVideoSimple;
import com.material.components.activity.profile.ProfileBlueAppbar;
import com.material.components.activity.profile.ProfileCardHeader;
import com.material.components.activity.profile.ProfileCardHeaderImage;
import com.material.components.activity.profile.ProfileCardList;
import com.material.components.activity.profile.ProfileCardOverlap;
import com.material.components.activity.profile.ProfileDrawerImage;
import com.material.components.activity.profile.ProfileDrawerSimple;
import com.material.components.activity.profile.ProfileFabMenu;
import com.material.components.activity.profile.ProfileFormal;
import com.material.components.activity.profile.ProfileFreelancer;
import com.material.components.activity.profile.ProfileGallery;
import com.material.components.activity.profile.ProfileGalleryTwo;
import com.material.components.activity.profile.ProfileImageAppbar;
import com.material.components.activity.profile.ProfilePolygon;
import com.material.components.activity.profile.ProfilePurple;
import com.material.components.activity.profile.ProfileRating;
import com.material.components.activity.profile.ProfileRed;
import com.material.components.activity.profile.ProfileSkills;
import com.material.components.activity.progressactivity.ProgressBasic;
import com.material.components.activity.progressactivity.ProgressCircleCenter;
import com.material.components.activity.progressactivity.ProgressDotsBounce;
import com.material.components.activity.progressactivity.ProgressDotsFade;
import com.material.components.activity.progressactivity.ProgressDotsGrow;
import com.material.components.activity.progressactivity.ProgressLinearCenter;
import com.material.components.activity.progressactivity.ProgressLinearTop;
import com.material.components.activity.progressactivity.ProgressOnScroll;
import com.material.components.activity.progressactivity.ProgressPullRefresh;
import com.material.components.activity.search.SearchCity;
import com.material.components.activity.search.SearchFilterHotel;
import com.material.components.activity.search.SearchFilterProduct;
import com.material.components.activity.search.SearchFilterProperty;
import com.material.components.activity.search.SearchHistoryCard;
import com.material.components.activity.search.SearchPrimary;
import com.material.components.activity.search.SearchPrimaryBg;
import com.material.components.activity.search.SearchStore;
import com.material.components.activity.search.SearchToolbarDark;
import com.material.components.activity.search.SearchToolbarLight;
import com.material.components.activity.settings.SettingFlat;
import com.material.components.activity.settings.SettingProfile;
import com.material.components.activity.settings.SettingProfileLight;
import com.material.components.activity.settings.SettingSectioned;
import com.material.components.activity.shopping.ShoppingCartCard;
import com.material.components.activity.shopping.ShoppingCartCardDark;
import com.material.components.activity.shopping.ShoppingCartSimple;
import com.material.components.activity.shopping.ShoppingCategoryCard;
import com.material.components.activity.shopping.ShoppingCategoryImage;
import com.material.components.activity.shopping.ShoppingCategoryList;
import com.material.components.activity.shopping.ShoppingCheckoutCard;
import com.material.components.activity.shopping.ShoppingCheckoutOnePage;
import com.material.components.activity.shopping.ShoppingCheckoutStep;
import com.material.components.activity.shopping.ShoppingCheckoutTimeline;
import com.material.components.activity.shopping.ShoppingProductAdvDetails;
import com.material.components.activity.shopping.ShoppingProductDetails;
import com.material.components.activity.shopping.ShoppingProductGrid;
import com.material.components.activity.shopping.ShoppingSubCategoryTabs;
import com.material.components.activity.slider.SliderColorPicker;
import com.material.components.activity.slider.SliderDark;
import com.material.components.activity.slider.SliderLight;
import com.material.components.activity.sliderimage.SliderImageCard;
import com.material.components.activity.sliderimage.SliderImageCardAuto;
import com.material.components.activity.sliderimage.SliderImageHeader;
import com.material.components.activity.sliderimage.SliderImageHeaderAuto;
import com.material.components.activity.snackbartoast.SnackbarAndFab;
import com.material.components.activity.snackbartoast.SnackbarCustom;
import com.material.components.activity.snackbartoast.SnackbarToastBasic;
import com.material.components.activity.snackbartoast.ToastCustom;
import com.material.components.activity.stepper.StepperDots;
import com.material.components.activity.stepper.StepperProgress;
import com.material.components.activity.stepper.StepperText;
import com.material.components.activity.stepper.StepperVertical;
import com.material.components.activity.stepper.StepperWizardColor;
import com.material.components.activity.stepper.StepperWizardLight;
import com.material.components.activity.tabs.TabsBasic;
import com.material.components.activity.tabs.TabsDark;
import com.material.components.activity.tabs.TabsIcon;
import com.material.components.activity.tabs.TabsIconLight;
import com.material.components.activity.tabs.TabsIconStack;
import com.material.components.activity.tabs.TabsLight;
import com.material.components.activity.tabs.TabsRound;
import com.material.components.activity.tabs.TabsScroll;
import com.material.components.activity.tabs.TabsStore;
import com.material.components.activity.tabs.TabsTextIcon;
import com.material.components.activity.timeline.TimelineDotCard;
import com.material.components.activity.timeline.TimelineFeed;
import com.material.components.activity.timeline.TimelinePath;
import com.material.components.activity.timeline.TimelineSimple;
import com.material.components.activity.timeline.TimelineTwitter;
import com.material.components.activity.toolbar.ToolbarBasic;
import com.material.components.activity.toolbar.ToolbarCollapse;
import com.material.components.activity.toolbar.ToolbarCollapsePin;
import com.material.components.activity.toolbar.ToolbarDark;
import com.material.components.activity.toolbar.ToolbarLight;
import com.material.components.activity.verification.VerificationBlue;
import com.material.components.activity.verification.VerificationCode;
import com.material.components.activity.verification.VerificationHeader;
import com.material.components.activity.verification.VerificationImage;
import com.material.components.activity.verification.VerificationOrange;
import com.material.components.activity.verification.VerificationPhone;
import com.material.components.adapter.ExpandableRecyclerAdapter;
import com.material.components.adapter.MainMenuAdapter;
import com.material.components.data.GDPR;
import com.material.components.data.RemoteConfig;
import com.material.components.data.SharedPref;
import com.material.components.fcm.ActivityNotifications;
import com.material.components.model.MenuType;
import com.material.components.room.AppDatabase;
import com.material.components.room.DAO;
import com.material.components.utils.NetworkCheck;
import com.material.components.utils.Tools;

import java.util.ArrayList;
import java.util.List;

public class MainMenu extends AppCompatActivity {

    private RecyclerView recycler;
    private MainMenuAdapter adapter;
  //  private SharedPref sharedPref;
    private RemoteConfig remoteConfig;
    private ActionBar actionBar;
    private Toolbar toolbar;
    private DrawerLayout drawer;
    private View navigation_header;

    private View notif_badge;
    private int notification_count = -1;
    private DAO dao;
   // private AdView mAdView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // sharedPref = new SharedPref(this);

        remoteConfig = new RemoteConfig();
        remoteConfig.fetchData(this);
        dao = AppDatabase.getDb(this).getDAO();

        initToolbar();
        initComponentMenu();
    //    initDrawerMenu();


    }

    private void initToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeButtonEnabled(true);
        Tools.setSystemBarColor(this, android.R.color.black);
    }

    private void initComponentMenu() {
        recycler = (RecyclerView) findViewById(R.id.main_recycler);
        adapter = new MainMenuAdapter(this, generateMenuItems(), new MainMenuAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int itemId) {
                onMenuItemSelected(itemId);
            }
        });

    //    adapter.setMode(ExpandableRecyclerAdapter.MODE_ACCORDION);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setNestedScrollingEnabled(false);
     //   recycler.setAdapter(adapter);

    }

    private void onMenuItemSelected(int itemId) {


        switch (itemId) {
            // Bottom Navigation -------------------------------------------------------------------
            case 22004:
                startActivity(new Intent(this, ShoppingSubCategoryTabs.class));
                break;
            case 27004:
                startActivity(new Intent(this, LoginImageTeal.class));
                break;

            // about material x ---------------------------------------------------------------------

        }
    }

    private List<MainMenuAdapter.ListItem> generateMenuItems() {
        List<MainMenuAdapter.ListItem> items = new ArrayList<>();

        items.add(new MainMenuAdapter.ListItem(-1, null, -1, MenuType.DIVIDER));

        items.add(new MainMenuAdapter.ListItem(22004, "Sub Category Tabs", -1, MenuType.SUB_HEADER));

        items.add(new MainMenuAdapter.ListItem(27004, "Image Teal", -1, MenuType.SUB_HEADER));

        return items;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity_main, menu);
        Tools.changeMenuIconColor(menu, Color.WHITE);
        Tools.changeOverflowMenuIconColor(toolbar, Color.WHITE);

        final MenuItem menuItem = menu.findItem(R.id.action_notifications);

        View actionView = MenuItemCompat.getActionView(menuItem);
        notif_badge = actionView.findViewById(R.id.notif_badge);

        setupBadge();

        actionView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onOptionsItemSelected(menuItem);
            }
        });

        return true;
    }

    private void setupBadge() {
        if (notif_badge == null) return;
        if (notification_count == 0) {
            notif_badge.setVisibility(View.GONE);
        } else {
            notif_badge.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int item_id = item.getItemId();
        if (item_id == R.id.action_portfolio) {
            Tools.openInAppBrowser(this, "http://portfolio.dream-space.web.id/", false);
        } else if (item_id == R.id.action_notifications) {
            ActivityNotifications.navigate(this);
        } else if (item_id == R.id.action_rate) {
            Tools.rateAction(this);
        } else if (item_id == R.id.action_about) {
            showDialogAbout();

        }
        return super.onOptionsItemSelected(item);
    }

    private void initDrawerMenu() {
        final NavigationView nav_view = (NavigationView) findViewById(R.id.nav_view);
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close) {
            public void onDrawerOpened(View drawerView) {
                updateCounter(nav_view);
                super.onDrawerOpened(drawerView);
            }
        };
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        nav_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(final MenuItem item) {
                int item_id = item.getItemId();
                if (item_id == R.id.action_portfolio) {
                    Tools.openInAppBrowser(MainMenu.this, "http://portfolio.dream-space.web.id/", false);
                } else if (item_id == R.id.action_notifications) {
                    ActivityNotifications.navigate(MainMenu.this);
                } else if (item_id == R.id.action_rate) {
                    Tools.rateAction(MainMenu.this);
                } else if (item_id == R.id.action_about) {
                    showDialogAbout();
                }
                return true;
            }
        });

        // navigation header
        navigation_header = nav_view.getHeaderView(0);

        TextView tv_new_version = (TextView) navigation_header.findViewById(R.id.tv_new_version);
        ImageButton bt_update = (ImageButton) navigation_header.findViewById(R.id.bt_update);
        if (Tools.getVersionCode(this) >= remoteConfig.getAppVersion()) {
            tv_new_version.setVisibility(View.GONE);
            bt_update.setVisibility(View.GONE);
        }
        bt_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Tools.rateAction(MainMenu.this);
            }
        });
    }

    private void updateCounter(NavigationView nav) {
        Menu m = nav.getMenu();
        View drw_notif_badge = (m.findItem(R.id.action_notifications).getActionView().findViewById(R.id.notif_badge));
        if (notification_count == 0) {
            drw_notif_badge.setVisibility(View.GONE);
        } else {
            drw_notif_badge.setVisibility(View.VISIBLE);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onPause() {
        super.onPause();

    }

    @Override
    public void onBackPressed() {
        doExitApp();
    }

    private long exitTime = 0;

    public void doExitApp() {
        if ((System.currentTimeMillis() - exitTime) > 2000) {
            Toast.makeText(this, "Press again to exit app", Toast.LENGTH_SHORT).show();
            exitTime = System.currentTimeMillis();
        } else {
            finish();
        }
    }

    private void showDialogAbout() {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE); // before
        dialog.setContentView(R.layout.dialog_about);
        dialog.setCancelable(true);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
        lp.copyFrom(dialog.getWindow().getAttributes());
        lp.width = WindowManager.LayoutParams.WRAP_CONTENT;
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;

        ((TextView) dialog.findViewById(R.id.tv_version)).setText("Version " + BuildConfig.VERSION_NAME);

        ((View) dialog.findViewById(R.id.bt_getcode)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://codecanyon.net/user/dream_space/portfolio"));
                startActivity(i);
            }
        });

        ((ImageButton) dialog.findViewById(R.id.bt_close)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        ((Button) dialog.findViewById(R.id.bt_rate)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Tools.rateAction(MainMenu.this);
            }
        });

        ((Button) dialog.findViewById(R.id.bt_portfolio)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Tools.openInAppBrowser(MainMenu.this, "http://portfolio.dream-space.web.id/", false);
            }
        });

        dialog.show();
        dialog.getWindow().setAttributes(lp);
    }

    private void showDialogOffer() {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE); // before
        dialog.setContentView(R.layout.dialog_offer);
        dialog.setCancelable(true);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
        lp.copyFrom(dialog.getWindow().getAttributes());
        lp.width = WindowManager.LayoutParams.WRAP_CONTENT;
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;

        ((View) dialog.findViewById(R.id.bt_getcode)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://codecanyon.net/user/dream_space/portfolio"));
                startActivity(i);
            }
        });

        dialog.show();
        dialog.getWindow().setAttributes(lp);
    }


    /* show ads */



    public static boolean active = false;

    @Override
    public void onStart() {
        super.onStart();
        active = true;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        active = false;
    }

}
