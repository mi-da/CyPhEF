/**
 */
package patternGenerator.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import patternGenerator.ManagingSystem;
import patternGenerator.PatternGeneratorFactory;
import patternGenerator.PatternGeneratorPackage;

/**
 * This is the item provider adapter for a {@link patternGenerator.ManagingSystem} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ManagingSystemItemProvider extends SubsystemItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagingSystemItemProvider(AdapterFactory adapterFactory) {
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

			addHasInterComponentInteractionsPropertyDescriptor(object);
			addHasIntraComponentInteractionsPropertyDescriptor(object);
			addGetAllInterComponentInteractionsPropertyDescriptor(object);
			addHasMyTargetInterComponentInteractionsPropertyDescriptor(object);
			addGetMyTargetInterComponentInteractionsPropertyDescriptor(object);
			addHasMyContextInterComponentInteractionsPropertyDescriptor(object);
			addGetMyContextInterComponentInteractionsPropertyDescriptor(object);
			addGetAllIntraComponentInteractionsPropertyDescriptor(object);
			addHasMyIntraComponentInteractionsPropertyDescriptor(object);
			addGetAllMyIntraComponentInteractionsPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Has Inter Component Interactions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasInterComponentInteractionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ManagingSystem_hasInterComponentInteractions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManagingSystem_hasInterComponentInteractions_feature", "_UI_ManagingSystem_type"),
				 PatternGeneratorPackage.Literals.MANAGING_SYSTEM__HAS_INTER_COMPONENT_INTERACTIONS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Intra Component Interactions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasIntraComponentInteractionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ManagingSystem_hasIntraComponentInteractions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManagingSystem_hasIntraComponentInteractions_feature", "_UI_ManagingSystem_type"),
				 PatternGeneratorPackage.Literals.MANAGING_SYSTEM__HAS_INTRA_COMPONENT_INTERACTIONS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Get All Inter Component Interactions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGetAllInterComponentInteractionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ManagingSystem_getAllInterComponentInteractions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManagingSystem_getAllInterComponentInteractions_feature", "_UI_ManagingSystem_type"),
				 PatternGeneratorPackage.Literals.MANAGING_SYSTEM__GET_ALL_INTER_COMPONENT_INTERACTIONS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has My Target Inter Component Interactions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasMyTargetInterComponentInteractionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ManagingSystem_hasMyTargetInterComponentInteractions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManagingSystem_hasMyTargetInterComponentInteractions_feature", "_UI_ManagingSystem_type"),
				 PatternGeneratorPackage.Literals.MANAGING_SYSTEM__HAS_MY_TARGET_INTER_COMPONENT_INTERACTIONS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Get My Target Inter Component Interactions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGetMyTargetInterComponentInteractionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ManagingSystem_getMyTargetInterComponentInteractions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManagingSystem_getMyTargetInterComponentInteractions_feature", "_UI_ManagingSystem_type"),
				 PatternGeneratorPackage.Literals.MANAGING_SYSTEM__GET_MY_TARGET_INTER_COMPONENT_INTERACTIONS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has My Context Inter Component Interactions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasMyContextInterComponentInteractionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ManagingSystem_hasMyContextInterComponentInteractions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManagingSystem_hasMyContextInterComponentInteractions_feature", "_UI_ManagingSystem_type"),
				 PatternGeneratorPackage.Literals.MANAGING_SYSTEM__HAS_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Get My Context Inter Component Interactions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGetMyContextInterComponentInteractionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ManagingSystem_getMyContextInterComponentInteractions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManagingSystem_getMyContextInterComponentInteractions_feature", "_UI_ManagingSystem_type"),
				 PatternGeneratorPackage.Literals.MANAGING_SYSTEM__GET_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Get All Intra Component Interactions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGetAllIntraComponentInteractionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ManagingSystem_getAllIntraComponentInteractions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManagingSystem_getAllIntraComponentInteractions_feature", "_UI_ManagingSystem_type"),
				 PatternGeneratorPackage.Literals.MANAGING_SYSTEM__GET_ALL_INTRA_COMPONENT_INTERACTIONS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has My Intra Component Interactions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasMyIntraComponentInteractionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ManagingSystem_hasMyIntraComponentInteractions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManagingSystem_hasMyIntraComponentInteractions_feature", "_UI_ManagingSystem_type"),
				 PatternGeneratorPackage.Literals.MANAGING_SYSTEM__HAS_MY_INTRA_COMPONENT_INTERACTIONS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Get All My Intra Component Interactions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGetAllMyIntraComponentInteractionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ManagingSystem_getAllMyIntraComponentInteractions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManagingSystem_getAllMyIntraComponentInteractions_feature", "_UI_ManagingSystem_type"),
				 PatternGeneratorPackage.Literals.MANAGING_SYSTEM__GET_ALL_MY_INTRA_COMPONENT_INTERACTIONS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ManagingSystem_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManagingSystem_name_feature", "_UI_ManagingSystem_type"),
				 PatternGeneratorPackage.Literals.MANAGING_SYSTEM__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(PatternGeneratorPackage.Literals.MANAGING_SYSTEM__ANALYZE);
			childrenFeatures.add(PatternGeneratorPackage.Literals.MANAGING_SYSTEM__PLAN);
			childrenFeatures.add(PatternGeneratorPackage.Literals.MANAGING_SYSTEM__EXECUTE);
			childrenFeatures.add(PatternGeneratorPackage.Literals.MANAGING_SYSTEM__KNOWLEDGE);
			childrenFeatures.add(PatternGeneratorPackage.Literals.MANAGING_SYSTEM__MONITOR);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ManagingSystem)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ManagingSystem_type") :
			getString("_UI_ManagingSystem_type") + " " + label;
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

		switch (notification.getFeatureID(ManagingSystem.class)) {
			case PatternGeneratorPackage.MANAGING_SYSTEM__HAS_INTER_COMPONENT_INTERACTIONS:
			case PatternGeneratorPackage.MANAGING_SYSTEM__HAS_INTRA_COMPONENT_INTERACTIONS:
			case PatternGeneratorPackage.MANAGING_SYSTEM__HAS_MY_TARGET_INTER_COMPONENT_INTERACTIONS:
			case PatternGeneratorPackage.MANAGING_SYSTEM__HAS_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS:
			case PatternGeneratorPackage.MANAGING_SYSTEM__HAS_MY_INTRA_COMPONENT_INTERACTIONS:
			case PatternGeneratorPackage.MANAGING_SYSTEM__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PatternGeneratorPackage.MANAGING_SYSTEM__ANALYZE:
			case PatternGeneratorPackage.MANAGING_SYSTEM__PLAN:
			case PatternGeneratorPackage.MANAGING_SYSTEM__EXECUTE:
			case PatternGeneratorPackage.MANAGING_SYSTEM__KNOWLEDGE:
			case PatternGeneratorPackage.MANAGING_SYSTEM__MONITOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(PatternGeneratorPackage.Literals.MANAGING_SYSTEM__ANALYZE,
				 PatternGeneratorFactory.eINSTANCE.createAnalyze()));

		newChildDescriptors.add
			(createChildParameter
				(PatternGeneratorPackage.Literals.MANAGING_SYSTEM__PLAN,
				 PatternGeneratorFactory.eINSTANCE.createPlan()));

		newChildDescriptors.add
			(createChildParameter
				(PatternGeneratorPackage.Literals.MANAGING_SYSTEM__EXECUTE,
				 PatternGeneratorFactory.eINSTANCE.createExecute()));

		newChildDescriptors.add
			(createChildParameter
				(PatternGeneratorPackage.Literals.MANAGING_SYSTEM__KNOWLEDGE,
				 PatternGeneratorFactory.eINSTANCE.createKnowledge()));

		newChildDescriptors.add
			(createChildParameter
				(PatternGeneratorPackage.Literals.MANAGING_SYSTEM__MONITOR,
				 PatternGeneratorFactory.eINSTANCE.createMonitor()));
	}

}
