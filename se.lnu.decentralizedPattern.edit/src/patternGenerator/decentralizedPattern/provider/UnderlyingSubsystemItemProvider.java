/**
 */
package patternGenerator.decentralizedPattern.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import patternGenerator.decentralizedPattern.DecentralizedPatternPackage;
import patternGenerator.decentralizedPattern.UnderlyingSubsystem;

import patternGenerator.provider.ManagingSystemItemProvider;
import patternGenerator.provider.PatternsEditPlugin;

/**
 * This is the item provider adapter for a {@link patternGenerator.decentralizedPattern.UnderlyingSubsystem} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UnderlyingSubsystemItemProvider extends ManagingSystemItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnderlyingSubsystemItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addHasAssociatedTargetPlannerPropertyDescriptor(object);
			addHasAssociatedContextPlannerPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Has Associated Target Planner feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasAssociatedTargetPlannerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnderlyingSubsystem_hasAssociatedTargetPlanner_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnderlyingSubsystem_hasAssociatedTargetPlanner_feature", "_UI_UnderlyingSubsystem_type"),
				 DecentralizedPatternPackage.Literals.UNDERLYING_SUBSYSTEM__HAS_ASSOCIATED_TARGET_PLANNER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Associated Context Planner feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasAssociatedContextPlannerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnderlyingSubsystem_hasAssociatedContextPlanner_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnderlyingSubsystem_hasAssociatedContextPlanner_feature", "_UI_UnderlyingSubsystem_type"),
				 DecentralizedPatternPackage.Literals.UNDERLYING_SUBSYSTEM__HAS_ASSOCIATED_CONTEXT_PLANNER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns UnderlyingSubsystem.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UnderlyingSubsystem"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((UnderlyingSubsystem)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_UnderlyingSubsystem_type") :
			getString("_UI_UnderlyingSubsystem_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(UnderlyingSubsystem.class)) {
			case DecentralizedPatternPackage.UNDERLYING_SUBSYSTEM__HAS_ASSOCIATED_TARGET_PLANNER:
			case DecentralizedPatternPackage.UNDERLYING_SUBSYSTEM__HAS_ASSOCIATED_CONTEXT_PLANNER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PatternsEditPlugin.INSTANCE;
	}

}
