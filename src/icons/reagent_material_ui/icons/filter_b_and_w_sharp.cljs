(ns reagent-material-ui.icons.filter-b-and-w-sharp
  "Imports @material-ui/icons/FilterBAndWSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def filter-b-and-w-sharp (create-svg-icon (e "path" #js {"d" "M21 3H3v18h18V3zm-2 16l-7-8v8H5l7-8V5h7v14z"})
                                           "FilterBAndWSharp"))
