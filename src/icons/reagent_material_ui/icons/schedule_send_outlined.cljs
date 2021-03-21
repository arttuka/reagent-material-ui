(ns reagent-material-ui.icons.schedule-send-outlined
  "Imports @material-ui/icons/ScheduleSendOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def schedule-send-outlined (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M17 12c-2.76 0-5 2.24-5 5s2.24 5 5 5 5-2.24 5-5-2.24-5-5-5zm1.65 7.35L16.5 17.2V14h1v2.79l1.85 1.85-.7.71z"}) (e "path" #js {"d" "M11 12l-6-1.5V7.01l8.87 3.74c.94-.47 2-.75 3.13-.75.1 0 .19.01.28.01L3 4v16l7-2.95V17c0-.8.14-1.56.39-2.28L5 16.99V13.5l6-1.5z"}))
                                             "ScheduleSendOutlined"))
