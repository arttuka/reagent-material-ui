(ns reagent-material-ui.icons.filter-5-two-tone
  "Imports @material-ui/icons/Filter5TwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def filter-5-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M7 17h14V3H7v14zm4-4h4v-2h-4V5h6v2h-4v2h2c1.1 0 2 .89 2 2v2c0 1.11-.9 2-2 2h-4v-2z", "opacity" ".3"}) (e "path" #js {"d" "M19 23v-2H3V5H1v16c0 1.1.9 2 2 2h16zm-2-10v-2c0-1.11-.9-2-2-2h-2V7h4V5h-6v6h4v2h-4v2h4c1.1 0 2-.89 2-2zm4-12H7c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V3c0-1.1-.9-2-2-2zm0 16H7V3h14v14z"}))
                                        "Filter5TwoTone"))
