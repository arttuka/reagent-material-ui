(ns reagent-material-ui.icons.details-two-tone
  "Imports @material-ui/icons/DetailsTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def details-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M13 8.92L18.6 19H13V8.92zm-2 0V19H5.4L11 8.92z", "opacity" ".3"}) (e "path" #js {"d" "M12 3L2 21h20L12 3zm1 5.92L18.6 19H13V8.92zm-2 0V19H5.4L11 8.92z"}))
                                       "DetailsTwoTone"))
