(ns reagent-material-ui.icons.arrow-right-alt-two-tone
  "Imports @material-ui/icons/ArrowRightAltTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def arrow-right-alt-two-tone (create-svg-icon (e "path" #js {"d" "M16.01 11H4v2h12.01v3L20 12l-3.99-4v3z"})
                                               "ArrowRightAltTwoTone"))
