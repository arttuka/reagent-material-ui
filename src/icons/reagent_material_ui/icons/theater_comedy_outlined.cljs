(ns reagent-material-ui.icons.theater-comedy-outlined
  "Imports @material-ui/icons/TheaterComedyOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def theater-comedy-outlined (create-svg-icon [(e "circle" #js {"cx" "19", "cy" "6.5", "r" "1"}) (e "circle" #js {"cx" "15", "cy" "6.5", "r" "1"}) (e "path" #js {"d" "M16.99 9c-1.38 0-2.5.84-2.5 1.88h5c0-1.04-1.12-1.88-2.5-1.88zM1 16c0 3.31 2.69 6 6 6s6-2.69 6-6V9H1v7zm2-5h8v5c0 2.21-1.79 4-4 4s-4-1.79-4-4v-5z"}) (e "path" #js {"d" "M11 2v5.5h2V4h8v5c0 2.21-1.79 4-4 4-.95 0-1.81-.35-2.5-.9v2.35c.76.35 1.61.55 2.5.55 3.31 0 6-2.69 6-6V2H11z"}) (e "circle" #js {"cx" "5", "cy" "13.5", "r" "1"}) (e "circle" #js {"cx" "9", "cy" "13.5", "r" "1"}) (e "path" #js {"d" "M7 17.88c1.38 0 2.5-.84 2.5-1.88h-5c0 1.04 1.12 1.88 2.5 1.88z"})]
                                              "TheaterComedyOutlined"))
