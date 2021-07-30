(ns reagent-material-ui.icons.view-week-two-tone
  "Imports @material-ui/icons/ViewWeekTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def view-week-two-tone (create-svg-icon [(e "path" #js {"d" "M8 18H4V6h4v12zm6 0h-4V6h4v12zm6 0h-4V6h4v12z", "opacity" ".3"}) (e "path" #js {"d" "M20 4H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zM8 18H4V6h4v12zm6 0h-4V6h4v12zm6 0h-4V6h4v12z"})]
                                         "ViewWeekTwoTone"))
