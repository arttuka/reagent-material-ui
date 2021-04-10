(ns reagent-material-ui.icons.print-two-tone
  "Imports @material-ui/icons/PrintTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def print-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M8 5h8v3H8z", "opacity" ".3"}) (e "circle" #js {"cy" "11.5", "r" "1", "cx" "18"}) (e "path" #js {"d" "M19 8h-1V3H6v5H5c-1.66 0-3 1.34-3 3v6h4v4h12v-4h4v-6c0-1.66-1.34-3-3-3zM8 5h8v3H8V5zm8 14H8v-4h8v4zm4-4h-2v-2H6v2H4v-4c0-.55.45-1 1-1h14c.55 0 1 .45 1 1v4z"}) (e "path" #js {"d" "M6 13h12v2h2v-4c0-.55-.45-1-1-1H5c-.55 0-1 .45-1 1v4h2v-2zm12-2.5c.55 0 1 .45 1 1s-.45 1-1 1-1-.45-1-1 .45-1 1-1z", "opacity" ".3"}))
                                     "PrintTwoTone"))
