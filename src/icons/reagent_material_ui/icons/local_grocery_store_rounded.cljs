(ns reagent-material-ui.icons.local-grocery-store-rounded
  "Imports @material-ui/icons/LocalGroceryStoreRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def local-grocery-store-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M15.55 13c1.22 0 1.74-1.01 1.75-1.03l3.55-6.44c.23-.45.18-.84-.01-1.11-.18-.26-.51-.42-.84-.42H5.21l-.67-1.43c-.16-.35-.52-.57-.9-.57H2c-.55 0-1 .45-1 1s.45 1 1 1h1l3.6 7.59-1.35 2.44C4.52 15.37 5.48 17 7 17h11c.55 0 1-.45 1-1s-.45-1-1-1H7l1.1-2h7.45z"}) (e "circle" #js {"cy" "20", "r" "2", "cx" "7"}) (e "circle" #js {"cy" "20", "r" "2", "cx" "17"}))
                                                  "LocalGroceryStoreRounded"))
