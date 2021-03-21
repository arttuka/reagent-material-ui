(ns reagent-material-ui.icons.car-repair-outlined
  "Imports @material-ui/icons/CarRepairOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def car-repair-outlined (create-svg-icon (e react/Fragment nil (e "circle" #js {"cy" "10.5", "r" "1", "cx" "9"}) (e "circle" #js {"cy" "10.5", "r" "1", "cx" "15"}) (e "path" #js {"d" "M5.78 16h.44c.43 0 .78-.36.78-.81V14h10v1.19c0 .45.34.81.78.81h.44c.43 0 .78-.36.78-.81v-6.5S17.66 4.66 17.44 4c-.05-.16-.12-.29-.19-.4-.02-.02-.03-.04-.05-.07-.38-.52-.92-.53-.92-.53H7.72s-.54.01-.92.54c-.02.02-.03.04-.05.06-.07.11-.14.24-.19.4C6.34 4.66 5 8.69 5 8.69v6.5c0 .45.35.81.78.81zM8.33 5h7.34l.23.69.43 1.31H7.67l.66-2zM7 9.01V9h10v3H7V9.01zm-3 8V19h7v3h2v-3h7v-1.99z"}))
                                          "CarRepairOutlined"))
