(ns reagent-material-ui.icons.ad-units-two-tone
  "Imports @material-ui/icons/AdUnitsTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def ad-units-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M7 3h10v1H7zm0 17h10v1H7z", "opacity" ".3"}) (e "path" #js {"d" "M17 1H7c-1.1 0-2 .9-2 2v18c0 1.1.9 2 2 2h10c1.1 0 2-.9 2-2V3c0-1.1-.9-2-2-2zM7 4V3h10v1H7zm0 14V6h10v12H7zm0 3v-1h10v1H7z"}) (e "path" #js {"d" "M16 7H8v2h8V7z"}))
                                        "AdUnitsTwoTone"))
