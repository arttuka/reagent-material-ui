(ns reagent-material-ui.icons.devices-two-tone
  "Imports @material-ui/icons/DevicesTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def devices-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M18 10h4v7h-4z", "opacity" ".3"}) (e "path" #js {"d" "M23 8h-6c-.55 0-1 .45-1 1v10c0 .55.45 1 1 1h6c.55 0 1-.45 1-1V9c0-.55-.45-1-1-1zm-1 9h-4v-7h4v7zM4 6h18V4H4c-1.1 0-2 .9-2 2v11H0v3h14v-3H4V6z"}))
                                       "DevicesTwoTone"))
