// CHECKSTYLE:OFF

package com.cloudbees.plugins.flow;

import org.jvnet.localizer.Localizable;
import org.jvnet.localizer.ResourceBundleHolder;

@SuppressWarnings({
    "",
    "PMD"
})
public class Messages {

    private final static ResourceBundleHolder holder = ResourceBundleHolder.get(Messages.class);

    /**
     * Launch build flow
     * 
     */
    public static String BuildFlowBootstrapper_Messages() {
        return holder.format("BuildFlowBootstrapper.Messages");
    }

    /**
     * Launch build flow
     * 
     */
    public static Localizable _BuildFlowBootstrapper_Messages() {
        return new Localizable(holder, "BuildFlowBootstrapper.Messages");
    }

    /**
     * Build Flow
     * 
     */
    public static String FlowIcon_Messages() {
        return holder.format("FlowIcon.Messages");
    }

    /**
     * Build Flow
     * 
     */
    public static Localizable _FlowIcon_Messages() {
        return new Localizable(holder, "FlowIcon.Messages");
    }

    /**
     * Build Flow
     * 
     */
    public static String BuildFlowAction_Messages() {
        return holder.format("BuildFlowAction.Messages");
    }

    /**
     * Build Flow
     * 
     */
    public static Localizable _BuildFlowAction_Messages() {
        return new Localizable(holder, "BuildFlowAction.Messages");
    }

    /**
     * You do not have the Run Scripts permission necessary to edit this field.
     * 
     */
    public static String BuildFlow_InsufficientPermissions() {
        return holder.format("BuildFlow.InsufficientPermissions");
    }

    /**
     * You do not have the Run Scripts permission necessary to edit this field.
     * 
     */
    public static Localizable _BuildFlow_InsufficientPermissions() {
        return new Localizable(holder, "BuildFlow.InsufficientPermissions");
    }

    /**
     * Build Flow
     * 
     */
    public static String BuildFlow_Messages() {
        return holder.format("BuildFlow.Messages");
    }

    /**
     * Build Flow
     * 
     */
    public static Localizable _BuildFlow_Messages() {
        return new Localizable(holder, "BuildFlow.Messages");
    }

    /**
     * Invalid DSL
     * 
     */
    public static String BuildFlow_InvalidDSL() {
        return holder.format("BuildFlow.InvalidDSL");
    }

    /**
     * Invalid DSL
     * 
     */
    public static Localizable _BuildFlow_InvalidDSL() {
        return new Localizable(holder, "BuildFlow.InvalidDSL");
    }

}
