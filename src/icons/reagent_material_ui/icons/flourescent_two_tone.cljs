(ns reagent-material-ui.icons.flourescent-two-tone
  "Imports @material-ui/icons/FlourescentTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def flourescent-two-tone (create-svg-icon [(e "path" #js {"d" "M7 11h10v2H7z", "opacity" ".3"}) (e "path" #js {"d" "M5 15h14V9H5v6zm2-4h10v2H7v-2zm4-9h2v3h-2zm6.2863 4.3989 1.7897-1.8024 1.4192 1.4092-1.7897 1.8024zM11 19h2v3h-2zm6.29-1.29 1.79 1.8 1.42-1.42-1.8-1.79zM3.4947 6.0091 4.902 4.602l1.789 1.789-1.4074 1.407zm-.0026 12.0672 1.8024-1.7897 1.4092 1.4192-1.8023 1.7897z"})]
                                           "FlourescentTwoTone"))
