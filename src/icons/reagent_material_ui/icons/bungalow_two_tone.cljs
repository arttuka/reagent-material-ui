(ns reagent-material-ui.icons.bungalow-two-tone
  "Imports @material-ui/icons/BungalowTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def bungalow-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M12 6.78l-3 4.8V19h2v-3h2v3h2v-7.42l-3-4.8zM13 14h-2v-2h2v2z", "opacity" ".3"}) (e "path" #js {"d" "M13 14h-2v-2h2v2zm5.1 2.56L17 14.79V21H7v-6.2l-1.1 1.76-1.7-1.06L12 3l7.8 12.5-1.7 1.06zM15 11.59l-3-4.8-3 4.8V19h2v-3h2v3h2v-7.41z"}))
                                        "BungalowTwoTone"))
