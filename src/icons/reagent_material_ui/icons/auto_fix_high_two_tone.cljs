(ns reagent-material-ui.icons.auto-fix-high-two-tone
  "Imports @material-ui/icons/AutoFixHighTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def auto-fix-high-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M4.4149 18.1667l7.17-7.17 1.4142 1.4141-7.17 7.1701z", "opacity" ".3"}) (e "path" #js {"d" "M20 7l.94-2.06L23 4l-2.06-.94L20 1l-.94 2.06L17 4l2.06.94zM8.5 7l.94-2.06L11.5 4l-2.06-.94L8.5 1l-.94 2.06L5.5 4l2.06.94zM20 12.5l-.94 2.06-2.06.94 2.06.94.94 2.06.94-2.06L23 15.5l-2.06-.94zm-2.29-3.38l-2.83-2.83c-.2-.19-.45-.29-.71-.29-.26 0-.51.1-.71.29L2.29 17.46c-.39.39-.39 1.02 0 1.41l2.83 2.83c.2.2.45.3.71.3s.51-.1.71-.29l11.17-11.17c.39-.39.39-1.03 0-1.42zM5.83 19.59l-1.41-1.41L11.59 11 13 12.41l-7.17 7.18zM14.41 11L13 9.59l1.17-1.17 1.41 1.41L14.41 11z"}))
                                             "AutoFixHighTwoTone"))