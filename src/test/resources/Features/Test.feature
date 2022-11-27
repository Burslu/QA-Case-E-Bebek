Feature:

  Scenario Outline: e-bebek Test

    When  https:e-bebek sitesi açılır.
    Given Arama çubuğuna "<kaşık maması>" yazılır
    And   arama sonucunda gelen sonuçlardan en son ürün açılır.
    Then  Ürün sepete eklenir.
    And   Sağdan açılan modadan sepeti gör butonuna tıklanır.
    And   Alışverişi tamamla butonuna tıklanır.Üye girişi ekranının açıldığı doğrulanır.
    Examples:
      |search|
      |kaşık maması|





