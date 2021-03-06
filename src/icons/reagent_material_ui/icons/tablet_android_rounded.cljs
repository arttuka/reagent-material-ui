(ns reagent-material-ui.icons.tablet-android-rounded
  "Imports @material-ui/icons/TabletAndroidRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def tablet-android-rounded (create-svg-icon (e "path" #js {"d" "M19 1H5c-1.1 0-2 .9-2 2v18c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V3c0-1.1-.9-2-2-2zm-5.5 19h-3c-.28 0-.5-.22-.5-.5s.22-.5.5-.5h3c.28 0 .5.22.5.5s-.22.5-.5.5zm5.5-4H5V6h14v10z"})
                                             "TabletAndroidRounded"))
