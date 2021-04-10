(ns reagent-material-ui.icons.swap-horiz-outlined
  "Imports @material-ui/icons/SwapHorizOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def swap-horiz-outlined (create-svg-icon (e "path" #js {"d" "M6.99 11L3 15l3.99 4v-3H14v-2H6.99v-3zM21 9l-3.99-4v3H10v2h7.01v3L21 9z"})
                                          "SwapHorizOutlined"))
