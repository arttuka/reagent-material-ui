(ns reagent-material-ui.icons.view-list-two-tone
  "Imports @material-ui/icons/ViewListTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def view-list-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M5 11h2v2H5zm0 4h2v2H5zm0-8h2v2H5zm4 0h9v2H9zm0 8h9v2H9zm0-4h9v2H9z", "opacity" ".3"}) (e "path" #js {"d" "M3 5v14h17V5H3zm4 12H5v-2h2v2zm0-4H5v-2h2v2zm0-4H5V7h2v2zm11 8H9v-2h9v2zm0-4H9v-2h9v2zm0-4H9V7h9v2z"}))
                                         "ViewListTwoTone"))
