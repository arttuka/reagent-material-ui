(ns reagent-material-ui.icons.add-alarm-two-tone
  "Imports @material-ui/icons/AddAlarmTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def add-alarm-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M12 6c-3.87 0-7 3.13-7 7s3.13 7 7 7 7-3.13 7-7-3.13-7-7-7zm4 8h-3v3h-2v-3H8v-2h3V9h2v3h3v2z", "opacity" ".3"}) (e "path" #js {"d" "M12 4c-4.97 0-9 4.03-9 9s4.02 9 9 9c4.97 0 9-4.03 9-9s-4.03-9-9-9zm0 16c-3.87 0-7-3.13-7-7s3.13-7 7-7 7 3.13 7 7-3.13 7-7 7zm1-11h-2v3H8v2h3v3h2v-3h3v-2h-3zm9-3.28l-4.6-3.86-1.29 1.53 4.6 3.86zM7.88 3.39L6.6 1.86 2 5.71l1.29 1.53z"}))
                                         "AddAlarmTwoTone"))
