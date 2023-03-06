package appinventor.ai_brian_kipkoros.Mlango_Wangu_Door;

import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.AppInventorCompatActivity;
import com.google.appinventor.components.runtime.BluetoothClient;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Image;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.ListPicker;
import com.google.appinventor.components.runtime.errors.PermissionException;
import com.google.appinventor.components.runtime.errors.StopBlocksExecution;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.FullScreenVideoUtil;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.youngandroid.runtime;
import gnu.expr.Language;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleInfo;
import gnu.expr.ModuleMethod;
import gnu.kawa.functions.Apply;
import gnu.kawa.functions.Format;
import gnu.kawa.functions.GetNamedPart;
import gnu.kawa.functions.IsEqual;
import gnu.kawa.reflect.Invoke;
import gnu.kawa.reflect.SlotGet;
import gnu.kawa.reflect.SlotSet;
import gnu.lists.Consumer;
import gnu.lists.FString;
import gnu.lists.LList;
import gnu.lists.Pair;
import gnu.lists.PairWithPosition;
import gnu.lists.VoidConsumer;
import gnu.mapping.CallContext;
import gnu.mapping.Environment;
import gnu.mapping.SimpleSymbol;
import gnu.mapping.Symbol;
import gnu.mapping.Values;
import gnu.mapping.WrongType;
import gnu.math.IntNum;
import kawa.lang.Promise;
import kawa.lib.lists;
import kawa.lib.misc;
import kawa.lib.strings;
import kawa.standard.Scheme;
import kawa.standard.require;

/* compiled from: Screen1.yail */
public class Screen1 extends Form implements Runnable {
    static final SimpleSymbol Lit0 = ((SimpleSymbol) new SimpleSymbol("Screen1").readResolve());
    static final SimpleSymbol Lit1 = ((SimpleSymbol) new SimpleSymbol("getMessage").readResolve());
    static final SimpleSymbol Lit10 = ((SimpleSymbol) new SimpleSymbol("Icon").readResolve());
    static final SimpleSymbol Lit100 = ((SimpleSymbol) new SimpleSymbol("ListPicker3").readResolve());
    static final IntNum Lit101 = IntNum.make(55);
    static final SimpleSymbol Lit102 = ((SimpleSymbol) new SimpleSymbol(Component.LISTVIEW_KEY_IMAGE).readResolve());
    static final FString Lit103 = new FString("com.google.appinventor.components.runtime.ListPicker");
    static final SimpleSymbol Lit104 = ((SimpleSymbol) new SimpleSymbol("Elements").readResolve());
    static final SimpleSymbol Lit105 = ((SimpleSymbol) new SimpleSymbol("BluetoothClient1").readResolve());
    static final SimpleSymbol Lit106 = ((SimpleSymbol) new SimpleSymbol("AddressesAndNames").readResolve());
    static final SimpleSymbol Lit107 = ((SimpleSymbol) new SimpleSymbol("list").readResolve());
    static final SimpleSymbol Lit108 = ((SimpleSymbol) new SimpleSymbol("Label17").readResolve());
    static final SimpleSymbol Lit109 = ((SimpleSymbol) new SimpleSymbol("Text").readResolve());
    static final SimpleSymbol Lit11 = ((SimpleSymbol) new SimpleSymbol("ShowListsAsJson").readResolve());
    static final SimpleSymbol Lit110 = ((SimpleSymbol) new SimpleSymbol("TextColor").readResolve());
    static final IntNum Lit111 = IntNum.make(-65536);
    static final SimpleSymbol Lit112 = ((SimpleSymbol) new SimpleSymbol("ListPicker3$BeforePicking").readResolve());
    static final SimpleSymbol Lit113 = ((SimpleSymbol) new SimpleSymbol("BeforePicking").readResolve());
    static final SimpleSymbol Lit114 = ((SimpleSymbol) new SimpleSymbol("Connect").readResolve());
    static final SimpleSymbol Lit115 = ((SimpleSymbol) new SimpleSymbol("Selection").readResolve());
    static final PairWithPosition Lit116 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1642883673780_0.201986005335675-0/youngandroidproject/../src/appinventor/ai_brian_kipkoros/Mlango_Wangu_Door/Screen1.yail", 692344);
    static final IntNum Lit117 = IntNum.make(-13382656);
    static final SimpleSymbol Lit118 = ((SimpleSymbol) new SimpleSymbol("ListPicker3$AfterPicking").readResolve());
    static final SimpleSymbol Lit119 = ((SimpleSymbol) new SimpleSymbol("AfterPicking").readResolve());
    static final SimpleSymbol Lit12 = ((SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve());
    static final FString Lit120 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit121 = ((SimpleSymbol) new SimpleSymbol("FontSize").readResolve());
    static final IntNum Lit122 = IntNum.make(20);
    static final SimpleSymbol Lit123 = ((SimpleSymbol) new SimpleSymbol("TextAlignment").readResolve());
    static final IntNum Lit124 = IntNum.make(1);
    static final FString Lit125 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit126 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit127 = ((SimpleSymbol) new SimpleSymbol("Label11").readResolve());
    static final IntNum Lit128 = IntNum.make(-1002);
    static final IntNum Lit129 = IntNum.make(-1002);
    static final SimpleSymbol Lit13 = ((SimpleSymbol) new SimpleSymbol("ShowStatusBar").readResolve());
    static final FString Lit130 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit131 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit132 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement2").readResolve());
    static final FString Lit133 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit134 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit135 = ((SimpleSymbol) new SimpleSymbol("Label18").readResolve());
    static final SimpleSymbol Lit136 = ((SimpleSymbol) new SimpleSymbol("FontBold").readResolve());
    static final IntNum Lit137;
    static final FString Lit138 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit139 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit14 = ((SimpleSymbol) new SimpleSymbol("Sizing").readResolve());
    static final SimpleSymbol Lit140 = ((SimpleSymbol) new SimpleSymbol("Label12").readResolve());
    static final IntNum Lit141 = IntNum.make(30);
    static final FString Lit142 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit143 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit144 = ((SimpleSymbol) new SimpleSymbol("Label13").readResolve());
    static final IntNum Lit145 = IntNum.make(50);
    static final IntNum Lit146 = IntNum.make(-1002);
    static final IntNum Lit147 = IntNum.make(-1002);
    static final FString Lit148 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit149 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit15 = ((SimpleSymbol) new SimpleSymbol("Title").readResolve());
    static final SimpleSymbol Lit150 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement3").readResolve());
    static final IntNum Lit151;
    static final IntNum Lit152 = IntNum.make(400);
    static final FString Lit153 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit154 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit155 = ((SimpleSymbol) new SimpleSymbol("Button1").readResolve());
    static final IntNum Lit156 = IntNum.make(180);
    static final SimpleSymbol Lit157 = ((SimpleSymbol) new SimpleSymbol("Visible").readResolve());
    static final IntNum Lit158 = IntNum.make((int) FullScreenVideoUtil.FULLSCREEN_VIDEO_ACTION_SEEK);
    static final FString Lit159 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit16 = ((SimpleSymbol) new SimpleSymbol("TitleVisible").readResolve());
    static final SimpleSymbol Lit160 = ((SimpleSymbol) new SimpleSymbol("SendText").readResolve());
    static final PairWithPosition Lit161 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1642883673780_0.201986005335675-0/youngandroidproject/../src/appinventor/ai_brian_kipkoros/Mlango_Wangu_Door/Screen1.yail", 1077330);
    static final IntNum Lit162 = IntNum.make(-1);
    static final SimpleSymbol Lit163 = ((SimpleSymbol) new SimpleSymbol("Button2").readResolve());
    static final SimpleSymbol Lit164 = ((SimpleSymbol) new SimpleSymbol("Button1$Click").readResolve());
    static final SimpleSymbol Lit165 = ((SimpleSymbol) new SimpleSymbol("Click").readResolve());
    static final FString Lit166 = new FString("com.google.appinventor.components.runtime.Button");
    static final IntNum Lit167 = IntNum.make(210);
    static final FString Lit168 = new FString("com.google.appinventor.components.runtime.Button");
    static final PairWithPosition Lit169;
    static final FString Lit17 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit170 = ((SimpleSymbol) new SimpleSymbol("Button2$Click").readResolve());
    static final FString Lit171 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit172 = ((SimpleSymbol) new SimpleSymbol("Label15").readResolve());
    static final IntNum Lit173 = IntNum.make(-1002);
    static final IntNum Lit174 = IntNum.make(-1002);
    static final FString Lit175 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit176 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit177 = ((SimpleSymbol) new SimpleSymbol("Label16").readResolve());
    static final IntNum Lit178 = IntNum.make(-1002);
    static final IntNum Lit179 = IntNum.make(-1002);
    static final SimpleSymbol Lit18 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement1").readResolve());
    static final FString Lit180 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit181 = new FString("com.google.appinventor.components.runtime.BluetoothClient");
    static final FString Lit182 = new FString("com.google.appinventor.components.runtime.BluetoothClient");
    static final SimpleSymbol Lit183 = ((SimpleSymbol) new SimpleSymbol("get-simple-name").readResolve());
    static final SimpleSymbol Lit184 = ((SimpleSymbol) new SimpleSymbol("android-log-form").readResolve());
    static final SimpleSymbol Lit185 = ((SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve());
    static final SimpleSymbol Lit186 = ((SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve());
    static final SimpleSymbol Lit187 = ((SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve());
    static final SimpleSymbol Lit188 = ((SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve());
    static final SimpleSymbol Lit189 = ((SimpleSymbol) new SimpleSymbol("add-to-events").readResolve());
    static final IntNum Lit19;
    static final SimpleSymbol Lit190 = ((SimpleSymbol) new SimpleSymbol("add-to-components").readResolve());
    static final SimpleSymbol Lit191 = ((SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve());
    static final SimpleSymbol Lit192 = ((SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve());
    static final SimpleSymbol Lit193 = ((SimpleSymbol) new SimpleSymbol("send-error").readResolve());
    static final SimpleSymbol Lit194 = ((SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve());
    static final SimpleSymbol Lit195 = ((SimpleSymbol) new SimpleSymbol("dispatchGenericEvent").readResolve());
    static final SimpleSymbol Lit196 = ((SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve());
    static final SimpleSymbol Lit2 = ((SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve());
    static final SimpleSymbol Lit20 = ((SimpleSymbol) new SimpleSymbol("Width").readResolve());
    static final IntNum Lit21 = IntNum.make(-2);
    static final FString Lit22 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit23 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit24 = ((SimpleSymbol) new SimpleSymbol("Label1").readResolve());
    static final FString Lit25 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit26 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit27 = ((SimpleSymbol) new SimpleSymbol("Label14").readResolve());
    static final FString Lit28 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit29 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit3 = ((SimpleSymbol) new SimpleSymbol("AccentColor").readResolve());
    static final SimpleSymbol Lit30 = ((SimpleSymbol) new SimpleSymbol("Label19").readResolve());
    static final FString Lit31 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit32 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit33 = ((SimpleSymbol) new SimpleSymbol("Label20").readResolve());
    static final FString Lit34 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit35 = new FString("com.google.appinventor.components.runtime.Image");
    static final SimpleSymbol Lit36 = ((SimpleSymbol) new SimpleSymbol("Image1").readResolve());
    static final SimpleSymbol Lit37 = ((SimpleSymbol) new SimpleSymbol("Height").readResolve());
    static final IntNum Lit38 = IntNum.make(80);
    static final SimpleSymbol Lit39 = ((SimpleSymbol) new SimpleSymbol("Picture").readResolve());
    static final IntNum Lit4;
    static final FString Lit40 = new FString("com.google.appinventor.components.runtime.Image");
    static final FString Lit41 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit42 = ((SimpleSymbol) new SimpleSymbol("Label2").readResolve());
    static final FString Lit43 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit44 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit45 = ((SimpleSymbol) new SimpleSymbol("Label3").readResolve());
    static final FString Lit46 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit47 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit48 = ((SimpleSymbol) new SimpleSymbol("Label4").readResolve());
    static final FString Lit49 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit5 = ((SimpleSymbol) new SimpleSymbol("number").readResolve());
    static final FString Lit50 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit51 = ((SimpleSymbol) new SimpleSymbol("Label5").readResolve());
    static final FString Lit52 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit53 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit54 = ((SimpleSymbol) new SimpleSymbol("Label6").readResolve());
    static final FString Lit55 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit56 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit57 = ((SimpleSymbol) new SimpleSymbol("Label9").readResolve());
    static final FString Lit58 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit59 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit6 = ((SimpleSymbol) new SimpleSymbol("AppName").readResolve());
    static final SimpleSymbol Lit60 = ((SimpleSymbol) new SimpleSymbol("Label10").readResolve());
    static final FString Lit61 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit62 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit63 = ((SimpleSymbol) new SimpleSymbol("Label21").readResolve());
    static final FString Lit64 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit65 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit66 = ((SimpleSymbol) new SimpleSymbol("Label22").readResolve());
    static final FString Lit67 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit68 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit69 = ((SimpleSymbol) new SimpleSymbol("Label23").readResolve());
    static final SimpleSymbol Lit7;
    static final FString Lit70 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit71 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit72 = ((SimpleSymbol) new SimpleSymbol("Label24").readResolve());
    static final FString Lit73 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit74 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit75 = ((SimpleSymbol) new SimpleSymbol("Label25").readResolve());
    static final FString Lit76 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit77 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit78 = ((SimpleSymbol) new SimpleSymbol("Label26").readResolve());
    static final FString Lit79 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit8 = ((SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve());
    static final FString Lit80 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit81 = ((SimpleSymbol) new SimpleSymbol("Label27").readResolve());
    static final FString Lit82 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit83 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit84 = ((SimpleSymbol) new SimpleSymbol("Label28").readResolve());
    static final FString Lit85 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit86 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit87 = ((SimpleSymbol) new SimpleSymbol("Label29").readResolve());
    static final FString Lit88 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit89 = new FString("com.google.appinventor.components.runtime.Label");
    static final IntNum Lit9;
    static final SimpleSymbol Lit90 = ((SimpleSymbol) new SimpleSymbol("Label30").readResolve());
    static final FString Lit91 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit92 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit93 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement5").readResolve());
    static final SimpleSymbol Lit94 = ((SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve());
    static final IntNum Lit95 = IntNum.make(3);
    static final SimpleSymbol Lit96 = ((SimpleSymbol) new SimpleSymbol("AlignVertical").readResolve());
    static final IntNum Lit97 = IntNum.make(2);
    static final FString Lit98 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit99 = new FString("com.google.appinventor.components.runtime.ListPicker");
    public static Screen1 Screen1;
    static final ModuleMethod lambda$Fn1 = null;
    static final ModuleMethod lambda$Fn10 = null;
    static final ModuleMethod lambda$Fn11 = null;
    static final ModuleMethod lambda$Fn12 = null;
    static final ModuleMethod lambda$Fn13 = null;
    static final ModuleMethod lambda$Fn14 = null;
    static final ModuleMethod lambda$Fn15 = null;
    static final ModuleMethod lambda$Fn16 = null;
    static final ModuleMethod lambda$Fn17 = null;
    static final ModuleMethod lambda$Fn18 = null;
    static final ModuleMethod lambda$Fn19 = null;
    static final ModuleMethod lambda$Fn2 = null;
    static final ModuleMethod lambda$Fn20 = null;
    static final ModuleMethod lambda$Fn21 = null;
    static final ModuleMethod lambda$Fn22 = null;
    static final ModuleMethod lambda$Fn23 = null;
    static final ModuleMethod lambda$Fn24 = null;
    static final ModuleMethod lambda$Fn25 = null;
    static final ModuleMethod lambda$Fn26 = null;
    static final ModuleMethod lambda$Fn27 = null;
    static final ModuleMethod lambda$Fn28 = null;
    static final ModuleMethod lambda$Fn29 = null;
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn30 = null;
    static final ModuleMethod lambda$Fn31 = null;
    static final ModuleMethod lambda$Fn32 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public BluetoothClient BluetoothClient1;
    public Button Button1;
    public final ModuleMethod Button1$Click;
    public Button Button2;
    public final ModuleMethod Button2$Click;
    public HorizontalArrangement HorizontalArrangement1;
    public HorizontalArrangement HorizontalArrangement2;
    public HorizontalArrangement HorizontalArrangement3;
    public HorizontalArrangement HorizontalArrangement5;
    public Image Image1;
    public Label Label1;
    public Label Label10;
    public Label Label11;
    public Label Label12;
    public Label Label13;
    public Label Label14;
    public Label Label15;
    public Label Label16;
    public Label Label17;
    public Label Label18;
    public Label Label19;
    public Label Label2;
    public Label Label20;
    public Label Label21;
    public Label Label22;
    public Label Label23;
    public Label Label24;
    public Label Label25;
    public Label Label26;
    public Label Label27;
    public Label Label28;
    public Label Label29;
    public Label Label3;
    public Label Label30;
    public Label Label4;
    public Label Label5;
    public Label Label6;
    public Label Label9;
    public ListPicker ListPicker3;
    public final ModuleMethod ListPicker3$AfterPicking;
    public final ModuleMethod ListPicker3$BeforePicking;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public LList components$Mnto$Mncreate;
    public final ModuleMethod dispatchEvent;
    public final ModuleMethod dispatchGenericEvent;
    public LList events$Mnto$Mnregister;
    public LList form$Mndo$Mnafter$Mncreation;
    public Environment form$Mnenvironment;
    public Symbol form$Mnname$Mnsymbol;
    public final ModuleMethod get$Mnsimple$Mnname;
    public Environment global$Mnvar$Mnenvironment;
    public LList global$Mnvars$Mnto$Mncreate;
    public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod onCreate;
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;

    static {
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit7 = simpleSymbol;
        Lit169 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1642883673780_0.201986005335675-0/youngandroidproject/../src/appinventor/ai_brian_kipkoros/Mlango_Wangu_Door/Screen1.yail", 1130578);
        int[] iArr = new int[2];
        iArr[0] = -1776412;
        Lit151 = IntNum.make(iArr);
        int[] iArr2 = new int[2];
        iArr2[0] = -1;
        Lit137 = IntNum.make(iArr2);
        int[] iArr3 = new int[2];
        iArr3[0] = -1;
        Lit19 = IntNum.make(iArr3);
        int[] iArr4 = new int[2];
        iArr4[0] = -1881765376;
        Lit9 = IntNum.make(iArr4);
        int[] iArr5 = new int[2];
        iArr5[0] = -3355444;
        Lit4 = IntNum.make(iArr5);
    }

    public Screen1() {
        ModuleInfo.register(this);
        frame frame2 = new frame();
        frame2.$main = this;
        this.get$Mnsimple$Mnname = new ModuleMethod(frame2, 1, Lit183, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.onCreate = new ModuleMethod(frame2, 2, "onCreate", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = new ModuleMethod(frame2, 3, Lit184, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(frame2, 4, Lit185, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 5, Lit186, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 7, Lit187, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(frame2, 8, Lit188, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(frame2, 9, Lit189, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(frame2, 10, Lit190, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(frame2, 11, Lit191, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(frame2, 12, Lit192, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = new ModuleMethod(frame2, 13, Lit193, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = new ModuleMethod(frame2, 14, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dispatchEvent = new ModuleMethod(frame2, 15, Lit194, 16388);
        this.dispatchGenericEvent = new ModuleMethod(frame2, 16, Lit195, 16388);
        this.lookup$Mnhandler = new ModuleMethod(frame2, 17, Lit196, 8194);
        ModuleMethod moduleMethod = new ModuleMethod(frame2, 18, (Object) null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime3771371404032975427.scm:627");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(frame2, 19, "$define", 0);
        lambda$Fn2 = new ModuleMethod(frame2, 20, (Object) null, 0);
        lambda$Fn3 = new ModuleMethod(frame2, 21, (Object) null, 0);
        lambda$Fn4 = new ModuleMethod(frame2, 22, (Object) null, 0);
        lambda$Fn5 = new ModuleMethod(frame2, 23, (Object) null, 0);
        lambda$Fn6 = new ModuleMethod(frame2, 24, (Object) null, 0);
        lambda$Fn7 = new ModuleMethod(frame2, 25, (Object) null, 0);
        lambda$Fn8 = new ModuleMethod(frame2, 26, (Object) null, 0);
        lambda$Fn9 = new ModuleMethod(frame2, 27, (Object) null, 0);
        lambda$Fn10 = new ModuleMethod(frame2, 28, (Object) null, 0);
        this.ListPicker3$BeforePicking = new ModuleMethod(frame2, 29, Lit112, 0);
        this.ListPicker3$AfterPicking = new ModuleMethod(frame2, 30, Lit118, 0);
        lambda$Fn11 = new ModuleMethod(frame2, 31, (Object) null, 0);
        lambda$Fn12 = new ModuleMethod(frame2, 32, (Object) null, 0);
        lambda$Fn13 = new ModuleMethod(frame2, 33, (Object) null, 0);
        lambda$Fn14 = new ModuleMethod(frame2, 34, (Object) null, 0);
        lambda$Fn15 = new ModuleMethod(frame2, 35, (Object) null, 0);
        lambda$Fn16 = new ModuleMethod(frame2, 36, (Object) null, 0);
        lambda$Fn17 = new ModuleMethod(frame2, 37, (Object) null, 0);
        lambda$Fn18 = new ModuleMethod(frame2, 38, (Object) null, 0);
        lambda$Fn19 = new ModuleMethod(frame2, 39, (Object) null, 0);
        lambda$Fn20 = new ModuleMethod(frame2, 40, (Object) null, 0);
        lambda$Fn21 = new ModuleMethod(frame2, 41, (Object) null, 0);
        lambda$Fn22 = new ModuleMethod(frame2, 42, (Object) null, 0);
        lambda$Fn23 = new ModuleMethod(frame2, 43, (Object) null, 0);
        lambda$Fn24 = new ModuleMethod(frame2, 44, (Object) null, 0);
        lambda$Fn25 = new ModuleMethod(frame2, 45, (Object) null, 0);
        lambda$Fn26 = new ModuleMethod(frame2, 46, (Object) null, 0);
        this.Button1$Click = new ModuleMethod(frame2, 47, Lit164, 0);
        lambda$Fn27 = new ModuleMethod(frame2, 48, (Object) null, 0);
        lambda$Fn28 = new ModuleMethod(frame2, 49, (Object) null, 0);
        this.Button2$Click = new ModuleMethod(frame2, 50, Lit170, 0);
        lambda$Fn29 = new ModuleMethod(frame2, 51, (Object) null, 0);
        lambda$Fn30 = new ModuleMethod(frame2, 52, (Object) null, 0);
        lambda$Fn31 = new ModuleMethod(frame2, 53, (Object) null, 0);
        lambda$Fn32 = new ModuleMethod(frame2, 54, (Object) null, 0);
    }

    public Object lookupInFormEnvironment(Symbol symbol) {
        return lookupInFormEnvironment(symbol, Boolean.FALSE);
    }

    public void run() {
        CallContext instance = CallContext.getInstance();
        Consumer consumer = instance.consumer;
        instance.consumer = VoidConsumer.instance;
        try {
            run(instance);
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        ModuleBody.runCleanup(instance, th, consumer);
    }

    public final void run(CallContext $ctx) {
        String obj;
        Consumer $result = $ctx.consumer;
        Object find = require.find("com.google.youngandroid.runtime");
        try {
            ((Runnable) find).run();
            this.$Stdebug$Mnform$St = Boolean.FALSE;
            this.form$Mnenvironment = Environment.make(misc.symbol$To$String(Lit0));
            FString stringAppend = strings.stringAppend(misc.symbol$To$String(Lit0), "-global-vars");
            if (stringAppend == null) {
                obj = null;
            } else {
                obj = stringAppend.toString();
            }
            this.global$Mnvar$Mnenvironment = Environment.make(obj);
            Screen1 = null;
            this.form$Mnname$Mnsymbol = Lit0;
            this.events$Mnto$Mnregister = LList.Empty;
            this.components$Mnto$Mncreate = LList.Empty;
            this.global$Mnvars$Mnto$Mncreate = LList.Empty;
            this.form$Mndo$Mnafter$Mncreation = LList.Empty;
            Object find2 = require.find("com.google.youngandroid.runtime");
            try {
                ((Runnable) find2).run();
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit3, Lit4, Lit5);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit6, "Mlango Wangu", Lit7);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit8, Lit9, Lit5);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit10, "MlangoWanguLogo.png", Lit7);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit11, Boolean.TRUE, Lit12);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit13, Boolean.FALSE, Lit12);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit14, "Responsive", Lit7);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit15, "Mlango Wangu", Lit7);
                    Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit16, Boolean.FALSE, Lit12), $result);
                } else {
                    addToFormDoAfterCreation(new Promise(lambda$Fn2));
                }
                this.HorizontalArrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit17, Lit18, lambda$Fn3), $result);
                } else {
                    addToComponents(Lit0, Lit22, Lit18, lambda$Fn4);
                }
                this.Label1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit18, Lit23, Lit24, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit18, Lit25, Lit24, Boolean.FALSE);
                }
                this.Label14 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit18, Lit26, Lit27, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit18, Lit28, Lit27, Boolean.FALSE);
                }
                this.Label19 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit18, Lit29, Lit30, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit18, Lit31, Lit30, Boolean.FALSE);
                }
                this.Label20 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit18, Lit32, Lit33, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit18, Lit34, Lit33, Boolean.FALSE);
                }
                this.Image1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit18, Lit35, Lit36, lambda$Fn5), $result);
                } else {
                    addToComponents(Lit18, Lit40, Lit36, lambda$Fn6);
                }
                this.Label2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit18, Lit41, Lit42, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit18, Lit43, Lit42, Boolean.FALSE);
                }
                this.Label3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit18, Lit44, Lit45, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit18, Lit46, Lit45, Boolean.FALSE);
                }
                this.Label4 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit18, Lit47, Lit48, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit18, Lit49, Lit48, Boolean.FALSE);
                }
                this.Label5 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit18, Lit50, Lit51, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit18, Lit52, Lit51, Boolean.FALSE);
                }
                this.Label6 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit18, Lit53, Lit54, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit18, Lit55, Lit54, Boolean.FALSE);
                }
                this.Label9 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit18, Lit56, Lit57, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit18, Lit58, Lit57, Boolean.FALSE);
                }
                this.Label10 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit18, Lit59, Lit60, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit18, Lit61, Lit60, Boolean.FALSE);
                }
                this.Label21 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit18, Lit62, Lit63, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit18, Lit64, Lit63, Boolean.FALSE);
                }
                this.Label22 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit18, Lit65, Lit66, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit18, Lit67, Lit66, Boolean.FALSE);
                }
                this.Label23 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit18, Lit68, Lit69, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit18, Lit70, Lit69, Boolean.FALSE);
                }
                this.Label24 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit18, Lit71, Lit72, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit18, Lit73, Lit72, Boolean.FALSE);
                }
                this.Label25 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit18, Lit74, Lit75, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit18, Lit76, Lit75, Boolean.FALSE);
                }
                this.Label26 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit18, Lit77, Lit78, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit18, Lit79, Lit78, Boolean.FALSE);
                }
                this.Label27 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit18, Lit80, Lit81, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit18, Lit82, Lit81, Boolean.FALSE);
                }
                this.Label28 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit18, Lit83, Lit84, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit18, Lit85, Lit84, Boolean.FALSE);
                }
                this.Label29 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit18, Lit86, Lit87, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit18, Lit88, Lit87, Boolean.FALSE);
                }
                this.Label30 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit18, Lit89, Lit90, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit18, Lit91, Lit90, Boolean.FALSE);
                }
                this.HorizontalArrangement5 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit18, Lit92, Lit93, lambda$Fn7), $result);
                } else {
                    addToComponents(Lit18, Lit98, Lit93, lambda$Fn8);
                }
                this.ListPicker3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit93, Lit99, Lit100, lambda$Fn9), $result);
                } else {
                    addToComponents(Lit93, Lit103, Lit100, lambda$Fn10);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit112, this.ListPicker3$BeforePicking);
                } else {
                    addToFormEnvironment(Lit112, this.ListPicker3$BeforePicking);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "ListPicker3", "BeforePicking");
                } else {
                    addToEvents(Lit100, Lit113);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit118, this.ListPicker3$AfterPicking);
                } else {
                    addToFormEnvironment(Lit118, this.ListPicker3$AfterPicking);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "ListPicker3", "AfterPicking");
                } else {
                    addToEvents(Lit100, Lit119);
                }
                this.Label17 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit18, Lit120, Lit108, lambda$Fn11), $result);
                } else {
                    addToComponents(Lit18, Lit125, Lit108, lambda$Fn12);
                }
                this.Label11 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit126, Lit127, lambda$Fn13), $result);
                } else {
                    addToComponents(Lit0, Lit130, Lit127, lambda$Fn14);
                }
                this.HorizontalArrangement2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit131, Lit132, lambda$Fn15), $result);
                } else {
                    addToComponents(Lit0, Lit133, Lit132, lambda$Fn16);
                }
                this.Label18 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit132, Lit134, Lit135, lambda$Fn17), $result);
                } else {
                    addToComponents(Lit132, Lit138, Lit135, lambda$Fn18);
                }
                this.Label12 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit132, Lit139, Lit140, lambda$Fn19), $result);
                } else {
                    addToComponents(Lit132, Lit142, Lit140, lambda$Fn20);
                }
                this.Label13 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit143, Lit144, lambda$Fn21), $result);
                } else {
                    addToComponents(Lit0, Lit148, Lit144, lambda$Fn22);
                }
                this.HorizontalArrangement3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit149, Lit150, lambda$Fn23), $result);
                } else {
                    addToComponents(Lit0, Lit153, Lit150, lambda$Fn24);
                }
                this.Button1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit150, Lit154, Lit155, lambda$Fn25), $result);
                } else {
                    addToComponents(Lit150, Lit159, Lit155, lambda$Fn26);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit164, this.Button1$Click);
                } else {
                    addToFormEnvironment(Lit164, this.Button1$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Button1", "Click");
                } else {
                    addToEvents(Lit155, Lit165);
                }
                this.Button2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit150, Lit166, Lit163, lambda$Fn27), $result);
                } else {
                    addToComponents(Lit150, Lit168, Lit163, lambda$Fn28);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit170, this.Button2$Click);
                } else {
                    addToFormEnvironment(Lit170, this.Button2$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Button2", "Click");
                } else {
                    addToEvents(Lit163, Lit165);
                }
                this.Label15 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit171, Lit172, lambda$Fn29), $result);
                } else {
                    addToComponents(Lit0, Lit175, Lit172, lambda$Fn30);
                }
                this.Label16 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit176, Lit177, lambda$Fn31), $result);
                } else {
                    addToComponents(Lit0, Lit180, Lit177, lambda$Fn32);
                }
                this.BluetoothClient1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit181, Lit105, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit182, Lit105, Boolean.FALSE);
                }
                runtime.initRuntime();
            } catch (ClassCastException e) {
                throw new WrongType(e, "java.lang.Runnable.run()", 1, find2);
            }
        } catch (ClassCastException e2) {
            throw new WrongType(e2, "java.lang.Runnable.run()", 1, find);
        }
    }

    static Object lambda3() {
        runtime.setAndCoerceProperty$Ex(Lit0, Lit3, Lit4, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit6, "Mlango Wangu", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit8, Lit9, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit10, "MlangoWanguLogo.png", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit11, Boolean.TRUE, Lit12);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit13, Boolean.FALSE, Lit12);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit14, "Responsive", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit15, "Mlango Wangu", Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit16, Boolean.FALSE, Lit12);
    }

    static Object lambda4() {
        runtime.setAndCoerceProperty$Ex(Lit18, Lit8, Lit19, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit18, Lit20, Lit21, Lit5);
    }

    static Object lambda5() {
        runtime.setAndCoerceProperty$Ex(Lit18, Lit8, Lit19, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit18, Lit20, Lit21, Lit5);
    }

    static Object lambda6() {
        runtime.setAndCoerceProperty$Ex(Lit36, Lit37, Lit38, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit36, Lit39, "MlangoWanguLogo.png", Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit36, Lit20, Lit38, Lit5);
    }

    static Object lambda7() {
        runtime.setAndCoerceProperty$Ex(Lit36, Lit37, Lit38, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit36, Lit39, "MlangoWanguLogo.png", Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit36, Lit20, Lit38, Lit5);
    }

    static Object lambda8() {
        runtime.setAndCoerceProperty$Ex(Lit93, Lit94, Lit95, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit93, Lit96, Lit97, Lit5);
    }

    static Object lambda9() {
        runtime.setAndCoerceProperty$Ex(Lit93, Lit94, Lit95, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit93, Lit96, Lit97, Lit5);
    }

    static Object lambda10() {
        runtime.setAndCoerceProperty$Ex(Lit100, Lit37, Lit101, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit100, Lit102, "bluetooth-512.png", Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit100, Lit20, Lit101, Lit5);
    }

    static Object lambda11() {
        runtime.setAndCoerceProperty$Ex(Lit100, Lit37, Lit101, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit100, Lit102, "bluetooth-512.png", Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit100, Lit20, Lit101, Lit5);
    }

    public Object ListPicker3$BeforePicking() {
        runtime.setThisForm();
        runtime.setAndCoerceProperty$Ex(Lit100, Lit104, runtime.getProperty$1(Lit105, Lit106), Lit107);
        runtime.setAndCoerceProperty$Ex(Lit108, Lit109, "Disconnected", Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit108, Lit110, Lit111, Lit5);
    }

    public Object ListPicker3$AfterPicking() {
        runtime.setThisForm();
        if (runtime.callComponentMethod(Lit105, Lit114, LList.list1(runtime.getProperty$1(Lit100, Lit115)), Lit116) == Boolean.FALSE) {
            return Values.empty;
        }
        runtime.setAndCoerceProperty$Ex(Lit108, Lit109, "Connected", Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit108, Lit110, Lit117, Lit5);
    }

    static Object lambda12() {
        runtime.setAndCoerceProperty$Ex(Lit108, Lit121, Lit122, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit108, Lit123, Lit124, Lit5);
    }

    static Object lambda13() {
        runtime.setAndCoerceProperty$Ex(Lit108, Lit121, Lit122, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit108, Lit123, Lit124, Lit5);
    }

    static Object lambda14() {
        runtime.setAndCoerceProperty$Ex(Lit127, Lit37, Lit128, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit127, Lit20, Lit129, Lit5);
    }

    static Object lambda15() {
        runtime.setAndCoerceProperty$Ex(Lit127, Lit37, Lit128, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit127, Lit20, Lit129, Lit5);
    }

    static Object lambda16() {
        runtime.setAndCoerceProperty$Ex(Lit132, Lit94, Lit95, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit132, Lit96, Lit97, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit132, Lit20, Lit21, Lit5);
    }

    static Object lambda17() {
        runtime.setAndCoerceProperty$Ex(Lit132, Lit94, Lit95, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit132, Lit96, Lit97, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit132, Lit20, Lit21, Lit5);
    }

    static Object lambda18() {
        runtime.setAndCoerceProperty$Ex(Lit135, Lit136, Boolean.TRUE, Lit12);
        runtime.setAndCoerceProperty$Ex(Lit135, Lit121, Lit122, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit135, Lit109, "Kindly Tap On The Icon ", Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit135, Lit110, Lit137, Lit5);
    }

    static Object lambda19() {
        runtime.setAndCoerceProperty$Ex(Lit135, Lit136, Boolean.TRUE, Lit12);
        runtime.setAndCoerceProperty$Ex(Lit135, Lit121, Lit122, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit135, Lit109, "Kindly Tap On The Icon ", Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit135, Lit110, Lit137, Lit5);
    }

    static Object lambda20() {
        runtime.setAndCoerceProperty$Ex(Lit140, Lit136, Boolean.TRUE, Lit12);
        runtime.setAndCoerceProperty$Ex(Lit140, Lit121, Lit141, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit140, Lit123, Lit97, Lit5);
    }

    static Object lambda21() {
        runtime.setAndCoerceProperty$Ex(Lit140, Lit136, Boolean.TRUE, Lit12);
        runtime.setAndCoerceProperty$Ex(Lit140, Lit121, Lit141, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit140, Lit123, Lit97, Lit5);
    }

    static Object lambda22() {
        runtime.setAndCoerceProperty$Ex(Lit144, Lit121, Lit145, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit144, Lit37, Lit146, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit144, Lit20, Lit147, Lit5);
    }

    static Object lambda23() {
        runtime.setAndCoerceProperty$Ex(Lit144, Lit121, Lit145, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit144, Lit37, Lit146, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit144, Lit20, Lit147, Lit5);
    }

    static Object lambda24() {
        runtime.setAndCoerceProperty$Ex(Lit150, Lit94, Lit95, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit150, Lit96, Lit97, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit150, Lit8, Lit151, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit150, Lit37, Lit152, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit150, Lit20, Lit21, Lit5);
    }

    static Object lambda25() {
        runtime.setAndCoerceProperty$Ex(Lit150, Lit94, Lit95, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit150, Lit96, Lit97, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit150, Lit8, Lit151, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit150, Lit37, Lit152, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit150, Lit20, Lit21, Lit5);
    }

    static Object lambda26() {
        runtime.setAndCoerceProperty$Ex(Lit155, Lit37, Lit156, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit155, Lit102, "unlockedDoor.png", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit155, Lit157, Boolean.FALSE, Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit155, Lit20, Lit158, Lit5);
    }

    static Object lambda27() {
        runtime.setAndCoerceProperty$Ex(Lit155, Lit37, Lit156, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit155, Lit102, "unlockedDoor.png", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit155, Lit157, Boolean.FALSE, Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit155, Lit20, Lit158, Lit5);
    }

    public Object Button1$Click() {
        runtime.setThisForm();
        runtime.callComponentMethod(Lit105, Lit160, LList.list1("1"), Lit161);
        runtime.setAndCoerceProperty$Ex(Lit140, Lit121, Lit122, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit140, Lit110, Lit162, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit140, Lit109, "To Lock", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit155, Lit157, Boolean.FALSE, Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit163, Lit157, Boolean.TRUE, Lit12);
    }

    static Object lambda28() {
        runtime.setAndCoerceProperty$Ex(Lit163, Lit37, Lit158, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit163, Lit102, "lockedDoor.png", Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit163, Lit20, Lit167, Lit5);
    }

    static Object lambda29() {
        runtime.setAndCoerceProperty$Ex(Lit163, Lit37, Lit158, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit163, Lit102, "lockedDoor.png", Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit163, Lit20, Lit167, Lit5);
    }

    public Object Button2$Click() {
        runtime.setThisForm();
        runtime.callComponentMethod(Lit105, Lit160, LList.list1("0"), Lit169);
        runtime.setAndCoerceProperty$Ex(Lit140, Lit121, Lit122, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit140, Lit110, Lit162, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit140, Lit109, "To Unlock", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit155, Lit157, Boolean.TRUE, Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit163, Lit157, Boolean.FALSE, Lit12);
    }

    static Object lambda30() {
        runtime.setAndCoerceProperty$Ex(Lit172, Lit37, Lit173, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit172, Lit20, Lit174, Lit5);
    }

    static Object lambda31() {
        runtime.setAndCoerceProperty$Ex(Lit172, Lit37, Lit173, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit172, Lit20, Lit174, Lit5);
    }

    static Object lambda32() {
        runtime.setAndCoerceProperty$Ex(Lit177, Lit37, Lit178, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit177, Lit20, Lit179, Lit5);
    }

    static Object lambda33() {
        runtime.setAndCoerceProperty$Ex(Lit177, Lit37, Lit178, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit177, Lit20, Lit179, Lit5);
    }

    /* compiled from: Screen1.yail */
    public class frame extends ModuleBody {
        Screen1 $main;

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 1:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 2:
                    if (!(obj instanceof Screen1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 3:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 5:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 7:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 12:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 13:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 14:
                    if (!(obj instanceof Screen1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                default:
                    return super.match1(moduleMethod, obj, callContext);
            }
        }

        public int match2(ModuleMethod moduleMethod, Object obj, Object obj2, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 4:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 5:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 8:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 9:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 11:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 17:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                default:
                    return super.match2(moduleMethod, obj, obj2, callContext);
            }
        }

        public int match4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 10:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                case 15:
                    if (!(obj instanceof Screen1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    if (!(obj2 instanceof Component)) {
                        return -786430;
                    }
                    callContext.value2 = obj2;
                    if (!(obj3 instanceof String)) {
                        return -786429;
                    }
                    callContext.value3 = obj3;
                    if (!(obj4 instanceof String)) {
                        return -786428;
                    }
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                case 16:
                    if (!(obj instanceof Screen1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    if (!(obj2 instanceof Component)) {
                        return -786430;
                    }
                    callContext.value2 = obj2;
                    if (!(obj3 instanceof String)) {
                        return -786429;
                    }
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                default:
                    return super.match4(moduleMethod, obj, obj2, obj3, obj4, callContext);
            }
        }

        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            switch (moduleMethod.selector) {
                case 1:
                    return this.$main.getSimpleName(obj);
                case 2:
                    try {
                        this.$main.onCreate((Bundle) obj);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "onCreate", 1, obj);
                    }
                case 3:
                    this.$main.androidLogForm(obj);
                    return Values.empty;
                case 5:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case 7:
                    try {
                        return this.$main.isBoundInFormEnvironment((Symbol) obj) ? Boolean.TRUE : Boolean.FALSE;
                    } catch (ClassCastException e3) {
                        throw new WrongType(e3, "is-bound-in-form-environment", 1, obj);
                    }
                case 12:
                    this.$main.addToFormDoAfterCreation(obj);
                    return Values.empty;
                case 13:
                    this.$main.sendError(obj);
                    return Values.empty;
                case 14:
                    this.$main.processException(obj);
                    return Values.empty;
                default:
                    return super.apply1(moduleMethod, obj);
            }
        }

        public Object apply4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4) {
            boolean z = true;
            switch (moduleMethod.selector) {
                case 10:
                    this.$main.addToComponents(obj, obj2, obj3, obj4);
                    return Values.empty;
                case 15:
                    try {
                        try {
                            try {
                                try {
                                    return this.$main.dispatchEvent((Component) obj, (String) obj2, (String) obj3, (Object[]) obj4) ? Boolean.TRUE : Boolean.FALSE;
                                } catch (ClassCastException e) {
                                    throw new WrongType(e, "dispatchEvent", 4, obj4);
                                }
                            } catch (ClassCastException e2) {
                                throw new WrongType(e2, "dispatchEvent", 3, obj3);
                            }
                        } catch (ClassCastException e3) {
                            throw new WrongType(e3, "dispatchEvent", 2, obj2);
                        }
                    } catch (ClassCastException e4) {
                        throw new WrongType(e4, "dispatchEvent", 1, obj);
                    }
                case 16:
                    Screen1 screen1 = this.$main;
                    try {
                        Component component = (Component) obj;
                        try {
                            String str = (String) obj2;
                            try {
                                if (obj3 == Boolean.FALSE) {
                                    z = false;
                                }
                                try {
                                    screen1.dispatchGenericEvent(component, str, z, (Object[]) obj4);
                                    return Values.empty;
                                } catch (ClassCastException e5) {
                                    throw new WrongType(e5, "dispatchGenericEvent", 4, obj4);
                                }
                            } catch (ClassCastException e6) {
                                throw new WrongType(e6, "dispatchGenericEvent", 3, obj3);
                            }
                        } catch (ClassCastException e7) {
                            throw new WrongType(e7, "dispatchGenericEvent", 2, obj2);
                        }
                    } catch (ClassCastException e8) {
                        throw new WrongType(e8, "dispatchGenericEvent", 1, obj);
                    }
                default:
                    return super.apply4(moduleMethod, obj, obj2, obj3, obj4);
            }
        }

        public Object apply2(ModuleMethod moduleMethod, Object obj, Object obj2) {
            switch (moduleMethod.selector) {
                case 4:
                    try {
                        this.$main.addToFormEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "add-to-form-environment", 1, obj);
                    }
                case 5:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj, obj2);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case 8:
                    try {
                        this.$main.addToGlobalVarEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e3) {
                        throw new WrongType(e3, "add-to-global-var-environment", 1, obj);
                    }
                case 9:
                    this.$main.addToEvents(obj, obj2);
                    return Values.empty;
                case 11:
                    this.$main.addToGlobalVars(obj, obj2);
                    return Values.empty;
                case 17:
                    return this.$main.lookupHandler(obj, obj2);
                default:
                    return super.apply2(moduleMethod, obj, obj2);
            }
        }

        public Object apply0(ModuleMethod moduleMethod) {
            switch (moduleMethod.selector) {
                case 18:
                    return Screen1.lambda2();
                case 19:
                    this.$main.$define();
                    return Values.empty;
                case 20:
                    return Screen1.lambda3();
                case 21:
                    return Screen1.lambda4();
                case 22:
                    return Screen1.lambda5();
                case 23:
                    return Screen1.lambda6();
                case 24:
                    return Screen1.lambda7();
                case 25:
                    return Screen1.lambda8();
                case 26:
                    return Screen1.lambda9();
                case 27:
                    return Screen1.lambda10();
                case 28:
                    return Screen1.lambda11();
                case 29:
                    return this.$main.ListPicker3$BeforePicking();
                case 30:
                    return this.$main.ListPicker3$AfterPicking();
                case 31:
                    return Screen1.lambda12();
                case 32:
                    return Screen1.lambda13();
                case 33:
                    return Screen1.lambda14();
                case 34:
                    return Screen1.lambda15();
                case 35:
                    return Screen1.lambda16();
                case 36:
                    return Screen1.lambda17();
                case 37:
                    return Screen1.lambda18();
                case 38:
                    return Screen1.lambda19();
                case 39:
                    return Screen1.lambda20();
                case 40:
                    return Screen1.lambda21();
                case 41:
                    return Screen1.lambda22();
                case 42:
                    return Screen1.lambda23();
                case 43:
                    return Screen1.lambda24();
                case 44:
                    return Screen1.lambda25();
                case 45:
                    return Screen1.lambda26();
                case 46:
                    return Screen1.lambda27();
                case 47:
                    return this.$main.Button1$Click();
                case 48:
                    return Screen1.lambda28();
                case 49:
                    return Screen1.lambda29();
                case 50:
                    return this.$main.Button2$Click();
                case 51:
                    return Screen1.lambda30();
                case 52:
                    return Screen1.lambda31();
                case 53:
                    return Screen1.lambda32();
                case 54:
                    return Screen1.lambda33();
                default:
                    return super.apply0(moduleMethod);
            }
        }

        public int match0(ModuleMethod moduleMethod, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 18:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 19:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 20:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 21:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 22:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 23:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 24:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 25:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 26:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 27:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 28:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 29:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 30:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 31:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 32:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 33:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 34:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 35:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 36:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 37:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 38:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 39:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 40:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 41:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 42:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 43:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 44:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 45:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 46:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 47:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 48:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 49:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 50:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 51:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 52:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 53:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 54:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }
    }

    public String getSimpleName(Object object) {
        return object.getClass().getSimpleName();
    }

    public void onCreate(Bundle icicle) {
        AppInventorCompatActivity.setClassicModeFromYail(true);
        super.onCreate(icicle);
    }

    public void androidLogForm(Object message) {
    }

    public void addToFormEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.form$Mnenvironment, object));
        this.form$Mnenvironment.put(name, object);
    }

    public Object lookupInFormEnvironment(Symbol name, Object default$Mnvalue) {
        boolean x = ((this.form$Mnenvironment == null ? 1 : 0) + 1) & true;
        if (x) {
            if (!this.form$Mnenvironment.isBound(name)) {
                return default$Mnvalue;
            }
        } else if (!x) {
            return default$Mnvalue;
        }
        return this.form$Mnenvironment.get(name);
    }

    public boolean isBoundInFormEnvironment(Symbol name) {
        return this.form$Mnenvironment.isBound(name);
    }

    public void addToGlobalVarEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.global$Mnvar$Mnenvironment, object));
        this.global$Mnvar$Mnenvironment.put(name, object);
    }

    public void addToEvents(Object component$Mnname, Object event$Mnname) {
        this.events$Mnto$Mnregister = lists.cons(lists.cons(component$Mnname, event$Mnname), this.events$Mnto$Mnregister);
    }

    public void addToComponents(Object container$Mnname, Object component$Mntype, Object component$Mnname, Object init$Mnthunk) {
        this.components$Mnto$Mncreate = lists.cons(LList.list4(container$Mnname, component$Mntype, component$Mnname, init$Mnthunk), this.components$Mnto$Mncreate);
    }

    public void addToGlobalVars(Object var, Object val$Mnthunk) {
        this.global$Mnvars$Mnto$Mncreate = lists.cons(LList.list2(var, val$Mnthunk), this.global$Mnvars$Mnto$Mncreate);
    }

    public void addToFormDoAfterCreation(Object thunk) {
        this.form$Mndo$Mnafter$Mncreation = lists.cons(thunk, this.form$Mndo$Mnafter$Mncreation);
    }

    public void sendError(Object error) {
        RetValManager.sendError(error == null ? null : error.toString());
    }

    public void processException(Object ex) {
        Object apply1 = Scheme.applyToArgs.apply1(GetNamedPart.getNamedPart.apply2(ex, Lit1));
        RuntimeErrorAlert.alert(this, apply1 == null ? null : apply1.toString(), ex instanceof YailRuntimeError ? ((YailRuntimeError) ex).getErrorType() : "Runtime Error", "End Application");
    }

    public boolean dispatchEvent(Component componentObject, String registeredComponentName, String eventName, Object[] args) {
        boolean x;
        SimpleSymbol registeredObject = misc.string$To$Symbol(registeredComponentName);
        if (!isBoundInFormEnvironment(registeredObject)) {
            EventDispatcher.unregisterEventForDelegation(this, registeredComponentName, eventName);
            return false;
        } else if (lookupInFormEnvironment(registeredObject) != componentObject) {
            return false;
        } else {
            try {
                Scheme.apply.apply2(lookupHandler(registeredComponentName, eventName), LList.makeList(args, 0));
                return true;
            } catch (StopBlocksExecution e) {
                return false;
            } catch (PermissionException exception) {
                exception.printStackTrace();
                if (this == componentObject) {
                    x = true;
                } else {
                    x = false;
                }
                if (!x ? x : IsEqual.apply(eventName, "PermissionNeeded")) {
                    processException(exception);
                } else {
                    PermissionDenied(componentObject, eventName, exception.getPermissionNeeded());
                }
                return false;
            } catch (Throwable exception2) {
                androidLogForm(exception2.getMessage());
                exception2.printStackTrace();
                processException(exception2);
                return false;
            }
        }
    }

    public void dispatchGenericEvent(Component componentObject, String eventName, boolean notAlreadyHandled, Object[] args) {
        Boolean bool;
        boolean x = true;
        Object handler = lookupInFormEnvironment(misc.string$To$Symbol(strings.stringAppend("any$", getSimpleName(componentObject), "$", eventName)));
        if (handler != Boolean.FALSE) {
            try {
                Apply apply = Scheme.apply;
                if (notAlreadyHandled) {
                    bool = Boolean.TRUE;
                } else {
                    bool = Boolean.FALSE;
                }
                apply.apply2(handler, lists.cons(componentObject, lists.cons(bool, LList.makeList(args, 0))));
            } catch (StopBlocksExecution e) {
            } catch (PermissionException exception) {
                exception.printStackTrace();
                if (this != componentObject) {
                    x = false;
                }
                if (!x ? x : IsEqual.apply(eventName, "PermissionNeeded")) {
                    processException(exception);
                } else {
                    PermissionDenied(componentObject, eventName, exception.getPermissionNeeded());
                }
            } catch (Throwable exception2) {
                androidLogForm(exception2.getMessage());
                exception2.printStackTrace();
                processException(exception2);
            }
        }
    }

    public Object lookupHandler(Object componentName, Object eventName) {
        String str = null;
        String obj = componentName == null ? null : componentName.toString();
        if (eventName != null) {
            str = eventName.toString();
        }
        return lookupInFormEnvironment(misc.string$To$Symbol(EventDispatcher.makeFullEventName(obj, str)));
    }

    public void $define() {
        Object reverse;
        Object obj;
        Object reverse2;
        Object obj2;
        Object obj3;
        Object var;
        Object component$Mnname;
        Object obj4;
        Language.setDefaults(Scheme.getInstance());
        try {
            run();
        } catch (Exception exception) {
            androidLogForm(exception.getMessage());
            processException(exception);
        }
        Screen1 = this;
        addToFormEnvironment(Lit0, this);
        Object obj5 = this.events$Mnto$Mnregister;
        while (obj5 != LList.Empty) {
            try {
                Pair arg0 = (Pair) obj5;
                Object event$Mninfo = arg0.getCar();
                Object apply1 = lists.car.apply1(event$Mninfo);
                String obj6 = apply1 == null ? null : apply1.toString();
                Object apply12 = lists.cdr.apply1(event$Mninfo);
                EventDispatcher.registerEventForDelegation(this, obj6, apply12 == null ? null : apply12.toString());
                obj5 = arg0.getCdr();
            } catch (ClassCastException e) {
                throw new WrongType(e, "arg0", -2, obj5);
            }
        }
        try {
            LList components = lists.reverse(this.components$Mnto$Mncreate);
            addToGlobalVars(Lit2, lambda$Fn1);
            reverse = lists.reverse(this.form$Mndo$Mnafter$Mncreation);
            while (reverse != LList.Empty) {
                Pair arg02 = (Pair) reverse;
                misc.force(arg02.getCar());
                reverse = arg02.getCdr();
            }
            obj = components;
            while (obj != LList.Empty) {
                Pair arg03 = (Pair) obj;
                Object component$Mninfo = arg03.getCar();
                component$Mnname = lists.caddr.apply1(component$Mninfo);
                lists.cadddr.apply1(component$Mninfo);
                Object component$Mnobject = Invoke.make.apply2(lists.cadr.apply1(component$Mninfo), lookupInFormEnvironment((Symbol) lists.car.apply1(component$Mninfo)));
                SlotSet.set$Mnfield$Ex.apply3(this, component$Mnname, component$Mnobject);
                addToFormEnvironment((Symbol) component$Mnname, component$Mnobject);
                obj = arg03.getCdr();
            }
            reverse2 = lists.reverse(this.global$Mnvars$Mnto$Mncreate);
            while (reverse2 != LList.Empty) {
                Pair arg04 = (Pair) reverse2;
                Object var$Mnval = arg04.getCar();
                var = lists.car.apply1(var$Mnval);
                addToGlobalVarEnvironment((Symbol) var, Scheme.applyToArgs.apply1(lists.cadr.apply1(var$Mnval)));
                reverse2 = arg04.getCdr();
            }
            LList component$Mndescriptors = components;
            obj2 = component$Mndescriptors;
            while (obj2 != LList.Empty) {
                Pair arg05 = (Pair) obj2;
                Object component$Mninfo2 = arg05.getCar();
                lists.caddr.apply1(component$Mninfo2);
                Object init$Mnthunk = lists.cadddr.apply1(component$Mninfo2);
                if (init$Mnthunk != Boolean.FALSE) {
                    Scheme.applyToArgs.apply1(init$Mnthunk);
                }
                obj2 = arg05.getCdr();
            }
            obj3 = component$Mndescriptors;
            while (obj3 != LList.Empty) {
                Pair arg06 = (Pair) obj3;
                Object component$Mninfo3 = arg06.getCar();
                Object component$Mnname2 = lists.caddr.apply1(component$Mninfo3);
                lists.cadddr.apply1(component$Mninfo3);
                callInitialize(SlotGet.field.apply2(this, component$Mnname2));
                obj3 = arg06.getCdr();
            }
        } catch (ClassCastException e2) {
            throw new WrongType(e2, "arg0", -2, obj3);
        } catch (ClassCastException e3) {
            throw new WrongType(e3, "arg0", -2, obj2);
        } catch (ClassCastException e4) {
            throw new WrongType(e4, "add-to-global-var-environment", 0, var);
        } catch (ClassCastException e5) {
            throw new WrongType(e5, "arg0", -2, reverse2);
        } catch (ClassCastException e6) {
            throw new WrongType(e6, "add-to-form-environment", 0, component$Mnname);
        } catch (ClassCastException e7) {
            throw new WrongType(e7, "lookup-in-form-environment", 0, obj4);
        } catch (ClassCastException e8) {
            throw new WrongType(e8, "arg0", -2, obj);
        } catch (ClassCastException e9) {
            throw new WrongType(e9, "arg0", -2, reverse);
        } catch (YailRuntimeError exception2) {
            processException(exception2);
        }
    }

    public static SimpleSymbol lambda1symbolAppend$V(Object[] argsArray) {
        LList symbols = LList.makeList(argsArray, 0);
        Apply apply = Scheme.apply;
        ModuleMethod moduleMethod = strings.string$Mnappend;
        Object obj = LList.Empty;
        LList lList = symbols;
        while (lList != LList.Empty) {
            try {
                Pair arg0 = (Pair) lList;
                Object arg02 = arg0.getCdr();
                Object car = arg0.getCar();
                try {
                    obj = Pair.make(misc.symbol$To$String((Symbol) car), obj);
                    lList = arg02;
                } catch (ClassCastException e) {
                    throw new WrongType(e, "symbol->string", 1, car);
                }
            } catch (ClassCastException e2) {
                throw new WrongType(e2, "arg0", -2, lList);
            }
        }
        Object apply2 = apply.apply2(moduleMethod, LList.reverseInPlace(obj));
        try {
            return misc.string$To$Symbol((CharSequence) apply2);
        } catch (ClassCastException e3) {
            throw new WrongType(e3, "string->symbol", 1, apply2);
        }
    }

    static Object lambda2() {
        return null;
    }
}
