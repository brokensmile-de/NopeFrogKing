package com.google.googlemobileads.c;


import apple.coregraphics.struct.CGSize;
import apple.foundation.NSValue;
import com.google.googlemobileads.struct.GADAdSize;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstBytePtr;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("GoogleMobileAds")
@Runtime(CRuntime.class)
public final class GoogleMobileAds {
	static {
		NatJ.register();
	}

	@Generated
	private GoogleMobileAds() {
	}

	@Generated
	@CFunction
	@ByValue
	public static native GADAdSize GADAdSizeFromCGSize(@ByValue CGSize size);

	@Generated
	@CFunction
	@ByValue
	public static native GADAdSize GADAdSizeFullWidthPortraitWithHeight(
			@NFloat double height);

	@Generated
	@CFunction
	@ByValue
	public static native GADAdSize GADAdSizeFullWidthLandscapeWithHeight(
			@NFloat double height);

	@Generated
	@CFunction
	public static native boolean GADAdSizeEqualToSize(@ByValue GADAdSize size1,
			@ByValue GADAdSize size2);

	@Generated
	@CFunction
	@ByValue
	public static native CGSize CGSizeFromGADAdSize(@ByValue GADAdSize size);

	@Generated
	@CFunction
	public static native boolean IsGADAdSizeValid(@ByValue GADAdSize size);

	@Generated
	@CFunction
	public static native boolean GADAdSizeIsFluid(@ByValue GADAdSize size);

	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStringFromGADAdSize(@ByValue GADAdSize size);

	@Generated
	@CFunction
	public static native NSValue NSValueFromGADAdSize(@ByValue GADAdSize size);

	@Generated
	@CFunction
	@ByValue
	public static native GADAdSize GADAdSizeFromNSValue(NSValue value);

	@Generated
	@CVariable()
	public static native ConstBytePtr GoogleMobileAdsVersionString();

	@Generated
	@CVariable()
	@ByValue
	public static native GADAdSize kGADAdSizeBanner();

	@Generated
	@CVariable()
	@ByValue
	public static native GADAdSize kGADAdSizeLargeBanner();

	@Generated
	@CVariable()
	@ByValue
	public static native GADAdSize kGADAdSizeMediumRectangle();

	@Generated
	@CVariable()
	@ByValue
	public static native GADAdSize kGADAdSizeFullBanner();

	@Generated
	@CVariable()
	@ByValue
	public static native GADAdSize kGADAdSizeLeaderboard();

	@Generated
	@CVariable()
	@ByValue
	public static native GADAdSize kGADAdSizeSkyscraper();

	@Generated
	@CVariable()
	@ByValue
	public static native GADAdSize kGADAdSizeSmartBannerPortrait();

	@Generated
	@CVariable()
	@ByValue
	public static native GADAdSize kGADAdSizeSmartBannerLandscape();

	@Generated
	@CVariable()
	@ByValue
	public static native GADAdSize kGADAdSizeFluid();

	@Generated
	@CVariable()
	@ByValue
	public static native GADAdSize kGADAdSizeInvalid();

	@Generated
	@CVariable()
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object kGADSimulatorID();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGADErrorDomain();

	@Generated
	@CVariable()
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object kDFPSimulatorID();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGADAdLoaderAdTypeNativeAppInstall();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGADAdLoaderAdTypeNativeContent();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kGADAdLoaderAdTypeNativeCustomTemplate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String GADCustomEventParametersServer();
}