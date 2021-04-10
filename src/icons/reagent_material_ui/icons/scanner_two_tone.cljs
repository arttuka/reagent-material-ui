(ns reagent-material-ui.icons.scanner-two-tone
  "Imports @material-ui/icons/ScannerTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def scanner-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M5 14v4h14v-4H5zm3 3H6v-2h2v2zm10 0h-8v-2h8v2z", "opacity" ".3"}) (e "path" #js {"d" "M19.8 10.7L4.2 5l-.7 1.9L17.6 12H5c-1.1 0-2 .9-2 2v4c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2v-5.5c0-.8-.5-1.6-1.2-1.8zM19 18H5v-4h14v4zM6 15h2v2H6zm4 0h8v2h-8z"}))
                                       "ScannerTwoTone"))
