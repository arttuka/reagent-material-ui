(ns reagent-material-ui.icons.filter-b-and-w-two-tone
  "Imports @material-ui/icons/FilterBAndWTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def filter-b-and-w-two-tone (create-svg-icon [(e "path" #js {"d" "M19 5h-7v6l7 8zm-7 14v-8l-7 8z", "opacity" ".3"}) (e "path" #js {"d" "M21 19V5c0-1.1-.9-2-2-2H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2zm-9 0H5l7-8V5h7v14l-7-8v8z"})]
                                              "FilterBAndWTwoTone"))
