(ns reagent-mui.icons.arrow-right-alt
  "Imports @mui/icons-material/ArrowRightAlt as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def arrow-right-alt (create-svg-icon (e "path" #js {"d" "M16.01 11H4v2h12.01v3L20 12l-3.99-4z"})
                                      "ArrowRightAlt"))
