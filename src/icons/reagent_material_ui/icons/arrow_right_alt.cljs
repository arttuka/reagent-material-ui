(ns reagent-material-ui.icons.arrow-right-alt
  "Imports @material-ui/icons/ArrowRightAlt as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def arrow-right-alt (create-svg-icon (e "path" #js {"d" "M16.01 11H4v2h12.01v3L20 12l-3.99-4z"})
                                      "ArrowRightAlt"))
