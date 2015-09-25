package e.hw1;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MyActivity extends Activity {
    public final static String EXTRA_MESSAGE="e.hw1.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_my, menu);
//        return true;
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_my, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
        switch (item.getItemId()) {
                case R.id.action_settings:

                    return true;
                default:
                return super.onOptionsItemSelected(item);
        }
    }

    /** Called when user clicks Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }
    // Had to add these definitions
    private void openSearch(){
        startActivity(new Intent(SearchManager.INTENT_ACTION_GLOBAL_SEARCH));
    }

    private void openSettings(){
        startActivity(new Intent(Settings.ACTION_SETTINGS));
    }
//
//    @Override
//    public void setCustomView(View view) {
//
//    }
//
//    @Override
//    public void setCustomView(View view, LayoutParams layoutParams) {
//
//    }
//
//    @Override
//    public void setCustomView(int resId) {
//
//    }
//
//    @Override
//    public void setIcon(int resId) {
//
//    }
//
//    @Override
//    public void setIcon(Drawable icon) {
//
//    }
//
//    @Override
//    public void setLogo(int resId) {
//
//    }
//
//    @Override
//    public void setLogo(Drawable logo) {
//
//    }
//
//    @Override
//    public void setListNavigationCallbacks(SpinnerAdapter adapter, OnNavigationListener callback) {
//
//    }
//
//    @Override
//    public void setSelectedNavigationItem(int position) {
//
//    }
//
//    @Override
//    public int getSelectedNavigationIndex() {
//        return 0;
//    }
//
//    @Override
//    public int getNavigationItemCount() {
//        return 0;
//    }
//
//    @Override
//    public void setTitle(CharSequence title) {
//
//    }
//
//    @Override
//    public void setTitle(int resId) {
//
//    }
//
//    @Override
//    public void setSubtitle(CharSequence subtitle) {
//
//    }
//
//    @Override
//    public void setSubtitle(int resId) {
//
//    }
//
//    @Override
//    public void setDisplayOptions(int options) {
//
//    }
//
//    @Override
//    public void setDisplayOptions(int options, int mask) {
//
//    }
//
//    @Override
//    public void setDisplayUseLogoEnabled(boolean useLogo) {
//
//    }
//
//    @Override
//    public void setDisplayShowHomeEnabled(boolean showHome) {
//
//    }
//
//    @Override
//    public void setDisplayHomeAsUpEnabled(boolean showHomeAsUp) {
//
//    }
//
//    @Override
//    public void setDisplayShowTitleEnabled(boolean showTitle) {
//
//    }
//
//    @Override
//    public void setDisplayShowCustomEnabled(boolean showCustom) {
//
//    }
//
//    @Override
//    public void setBackgroundDrawable(Drawable d) {
//
//    }
//
//    @Override
//    public View getCustomView() {
//        return null;
//    }
//
//    @Override
//    public CharSequence getTitle() {
//        return null;
//    }
//
//    @Override
//    public CharSequence getSubtitle() {
//        return null;
//    }
//
//    @Override
//    public int getNavigationMode() {
//        return 0;
//    }
//
//    @Override
//    public void setNavigationMode(int mode) {
//
//    }
//
//    @Override
//    public int getDisplayOptions() {
//        return 0;
//    }
//
//    @Override
//    public Tab newTab() {
//        return null;
//    }
//
//    @Override
//    public void addTab(Tab tab) {
//
//    }
//
//    @Override
//    public void addTab(Tab tab, boolean setSelected) {
//
//    }
//
//    @Override
//    public void addTab(Tab tab, int position) {
//
//    }
//
//    @Override
//    public void addTab(Tab tab, int position, boolean setSelected) {
//
//    }
//
//    @Override
//    public void removeTab(Tab tab) {
//
//    }
//
//    @Override
//    public void removeTabAt(int position) {
//
//    }
//
//    @Override
//    public void removeAllTabs() {
//
//    }
//
//    @Override
//    public void selectTab(Tab tab) {
//
//    }
//
//    @Override
//    public Tab getSelectedTab() {
//        return null;
//    }
//
//    @Override
//    public Tab getTabAt(int index) {
//        return null;
//    }
//
//    @Override
//    public int getTabCount() {
//        return 0;
//    }
//
//    @Override
//    public int getHeight() {
//        return 0;
//    }
//
//    @Override
//    public void show() {
//
//    }
//
//    @Override
//    public void hide() {
//
//    }
//
//    @Override
//    public boolean isShowing() {
//        return false;
//    }
//
//    @Override
//    public void addOnMenuVisibilityListener(OnMenuVisibilityListener listener) {
//
//    }
//
//    @Override
//    public void removeOnMenuVisibilityListener(OnMenuVisibilityListener listener) {
//
//    }
}
