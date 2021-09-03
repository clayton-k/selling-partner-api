
# PackedItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**itemSequenceNumber** | **Integer** | Item Sequence Number for the item. This must be the same value as sent in the order for a given item. | 
**buyerProductIdentifier** | **String** | Buyer&#39;s Standard Identification Number (ASIN) of an item. Either buyerProductIdentifier or vendorProductIdentifier is required. |  [optional]
**vendorProductIdentifier** | **String** | The vendor selected product identification of the item. Should be the same as was sent in the Purchase Order, like SKU Number. |  [optional]
**packedQuantity** | [**ItemQuantity**](ItemQuantity.md) | Total item quantity packed in the container. | 



