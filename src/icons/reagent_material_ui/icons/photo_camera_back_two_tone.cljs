(ns reagent-material-ui.icons.photo-camera-back-two-tone
  "Imports @material-ui/icons/PhotoCameraBackTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def photo-camera-back-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M15.95 7l-1.83-2H9.88L8.05 7H4v12h16V7h-4.05zM6 17l3-4 2.25 3 3-4L18 17H6z", "opacity" ".3"}) (e "path" #js {"d" "M20 5h-3.17L15 3H9L7.17 5H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V7c0-1.1-.9-2-2-2zm0 14H4V7h4.05l1.83-2h4.24l1.83 2H20v12zm-8.75-3L9 13l-3 4h12l-3.75-5-3 4z"}))
                                                 "PhotoCameraBackTwoTone"))
