(ns reagent-material-ui.icons.get-app-two-tone
  "Imports @material-ui/icons/GetAppTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def get-app-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M14.17 11H13V5h-2v6H9.83L12 13.17z", "opacity" ".3"}) (e "path" #js {"d" "M19 9h-4V3H9v6H5l7 7 7-7zm-8 2V5h2v6h1.17L12 13.17 9.83 11H11zm-6 7h14v2H5z"}))
                                       "GetAppTwoTone"))
