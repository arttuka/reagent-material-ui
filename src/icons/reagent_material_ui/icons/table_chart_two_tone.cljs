(ns reagent-material-ui.icons.table-chart-two-tone
  "Imports @material-ui/icons/TableChartTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def table-chart-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M5 5h15v3H5zm12 5h3v9h-3zm-7 0h5v9h-5zm-5 0h3v9H5z", "opacity" ".3"}) (e "path" #js {"d" "M20 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h15c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zM8 19H5v-9h3v9zm7 0h-5v-9h5v9zm5 0h-3v-9h3v9zm0-11H5V5h15v3z"}))
                                           "TableChartTwoTone"))
