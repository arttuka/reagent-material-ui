(ns reagent-material-ui.icons.car-rental-outlined
  "Imports @material-ui/icons/CarRentalOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def car-rental-outlined (create-svg-icon [(e "circle" #js {"cx" "9", "cy" "16.5", "r" "1"}) (e "circle" #js {"cx" "15", "cy" "16.5", "r" "1"}) (e "path" #js {"d" "M17.25 9.6c-.02-.02-.03-.04-.05-.07-.38-.52-.92-.53-.92-.53H7.72s-.54.01-.92.54c-.02.02-.03.04-.05.06-.07.11-.14.24-.19.4-.22.66-.74 2.22-1.56 4.69v6.5c0 .45.35.81.78.81h.44c.43 0 .78-.36.78-.81V20h10v1.19c0 .45.34.81.78.81h.44c.43 0 .78-.36.78-.81v-6.5c-.82-2.46-1.34-4.03-1.56-4.69-.05-.16-.12-.29-.19-.4zM8.33 11h7.34l.23.69.43 1.31H7.67l.66-2zM17 18H7v-3h10v3zM10.83 3C10.41 1.83 9.3 1 8 1 6.34 1 5 2.34 5 4c0 1.65 1.34 3 3 3 1.3 0 2.41-.84 2.83-2H16v2h2V5h1V3h-8.17zM8 5c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1z"})]
                                          "CarRentalOutlined"))
