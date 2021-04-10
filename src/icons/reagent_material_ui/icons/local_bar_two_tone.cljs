(ns reagent-material-ui.icons.local-bar-two-tone
  "Imports @material-ui/icons/LocalBarTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def local-bar-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M9.23 9L12 12.11 14.77 9z", "opacity" ".3"}) (e "path" #js {"d" "M21 5V3H3v2l8 9v5H6v2h12v-2h-5v-5l8-9zM5.66 5h12.69l-1.78 2H7.43L5.66 5zM12 12.11L9.23 9h5.54L12 12.11z"}))
                                         "LocalBarTwoTone"))
