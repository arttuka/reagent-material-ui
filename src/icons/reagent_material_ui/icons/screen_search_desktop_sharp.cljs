(ns reagent-material-ui.icons.screen-search-desktop-sharp
  "Imports @material-ui/icons/ScreenSearchDesktopSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def screen-search-desktop-sharp (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M1 19h22v2H1zM22 3H2v15h19.99L22 3zm-6.53 12.03l-2.09-2.09c-1.35.87-3.17.71-4.36-.47-1.37-1.37-1.37-3.58 0-4.95s3.58-1.37 4.95 0c1.18 1.18 1.34 3 .47 4.36l2.09 2.09-1.06 1.06z"}) (e "circle" #js {"cy" "10", "r" "2", "cx" "11.5"}))
                                                  "ScreenSearchDesktopSharp"))
