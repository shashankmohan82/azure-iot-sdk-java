package com.microsoft.azure.sdk.iot.android.helper;

import com.microsoft.appcenter.espresso.Factory;
import com.microsoft.appcenter.espresso.ReportHelper;
import com.microsoft.azure.sdk.iot.android.BuildConfig;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DummyAndroidRunner
{
    @Rule
    public ReportHelper reportHelper = Factory.getReportHelper();

    @After
    public void labelSnapshot()
    {
        reportHelper.label("Stopping App");
    }

    @TestGroup1
    @TestGroup2
    @TestGroup3
    @TestGroup4
    @TestGroup5
    @TestGroup6
    @TestGroup7
    @TestGroup8
    @TestGroup9
    @TestGroup10
    @TestGroup11
    @TestGroup12
    @Test
    public void dummyTest()
    {
    }
}
