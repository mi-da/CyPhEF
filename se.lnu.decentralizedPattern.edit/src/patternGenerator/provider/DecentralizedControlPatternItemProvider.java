/**
 */
package patternGenerator.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import patternGenerator.DecentralizedControlPattern;
import patternGenerator.PatternGeneratorFactory;
import patternGenerator.PatternGeneratorPackage;

import patternGenerator.decentralizedPattern.DecentralizedPatternFactory;

/**
 * This is the item provider adapter for a {@link patternGenerator.DecentralizedControlPattern} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DecentralizedControlPatternItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecentralizedControlPatternItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(PatternGeneratorPackage.Literals.DECENTRALIZED_CONTROL_PATTERN__ELEMENTS);
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
		return getString("_UI_DecentralizedControlPattern_type");
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

		switch (notification.getFeatureID(DecentralizedControlPattern.class)) {
			case PatternGeneratorPackage.DECENTRALIZED_CONTROL_PATTERN__ELEMENTS:
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
				(PatternGeneratorPackage.Literals.DECENTRALIZED_CONTROL_PATTERN__ELEMENTS,
				 PatternGeneratorFactory.eINSTANCE.createManagedSystem()));

		newChildDescriptors.add
			(createChildParameter
				(PatternGeneratorPackage.Literals.DECENTRALIZED_CONTROL_PATTERN__ELEMENTS,
				 PatternGeneratorFactory.eINSTANCE.createInterComponentInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(PatternGeneratorPackage.Literals.DECENTRALIZED_CONTROL_PATTERN__ELEMENTS,
				 PatternGeneratorFactory.eINSTANCE.createReadWriteInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(PatternGeneratorPackage.Literals.DECENTRALIZED_CONTROL_PATTERN__ELEMENTS,
				 PatternGeneratorFactory.eINSTANCE.createDelegation()));

		newChildDescriptors.add
			(createChildParameter
				(PatternGeneratorPackage.Literals.DECENTRALIZED_CONTROL_PATTERN__ELEMENTS,
				 PatternGeneratorFactory.eINSTANCE.createCoordination()));

		newChildDescriptors.add
			(createChildParameter
				(PatternGeneratorPackage.Literals.DECENTRALIZED_CONTROL_PATTERN__ELEMENTS,
				 DecentralizedPatternFactory.eINSTANCE.createNode()));

		newChildDescriptors.add
			(createChildParameter
				(PatternGeneratorPackage.Literals.DECENTRALIZED_CONTROL_PATTERN__ELEMENTS,
				 DecentralizedPatternFactory.eINSTANCE.createMaster()));

		newChildDescriptors.add
			(createChildParameter
				(PatternGeneratorPackage.Literals.DECENTRALIZED_CONTROL_PATTERN__ELEMENTS,
				 DecentralizedPatternFactory.eINSTANCE.createSlave()));

		newChildDescriptors.add
			(createChildParameter
				(PatternGeneratorPackage.Literals.DECENTRALIZED_CONTROL_PATTERN__ELEMENTS,
				 DecentralizedPatternFactory.eINSTANCE.createUnderlyingSubsystem()));

		newChildDescriptors.add
			(createChildParameter
				(PatternGeneratorPackage.Literals.DECENTRALIZED_CONTROL_PATTERN__ELEMENTS,
				 DecentralizedPatternFactory.eINSTANCE.createRegionalPlanner()));

		newChildDescriptors.add
			(createChildParameter
				(PatternGeneratorPackage.Literals.DECENTRALIZED_CONTROL_PATTERN__ELEMENTS,
				 DecentralizedPatternFactory.eINSTANCE.createPeer()));

		newChildDescriptors.add
			(createChildParameter
				(PatternGeneratorPackage.Literals.DECENTRALIZED_CONTROL_PATTERN__ELEMENTS,
				 DecentralizedPatternFactory.eINSTANCE.createHPeer()));
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
