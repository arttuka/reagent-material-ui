(ns reagent-material-ui.icons.photo-camera-back
  "Imports @material-ui/icons/PhotoCameraBack as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def photo-camera-back (create-svg-icon (e "path" #js {"d" "M20 5c1.1 0 2 .9 2 2v12c0 1.1-.9 2-2 2H4c-1.1 0-2-.9-2-2V7c0-1.1.9-2 2-2h3.17L9 3h6l1.83 2H20zm0 14V7H4v12h16zm-6-7-3 3.72L9 13l-3 4h12l-4-5z"})
                                        "PhotoCameraBack"))
