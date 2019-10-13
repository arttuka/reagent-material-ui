(ns reagent-material-ui.icons.pie-chart-two-tone
  "Imports @material-ui/icons/PieChartTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def pie-chart-two-tone (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M4 12c0 4.07 3.06 7.44 7 7.93V4.07C7.06 4.56 4 7.93 4 12zm9 7.93c3.61-.45 6.48-3.32 6.93-6.93H13v6.93zm0-15.86V11h6.93c-.45-3.61-3.32-6.48-6.93-6.93z", "opacity" ".3"}) (e "path" #js {"d" "M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm-1 17.93c-3.94-.49-7-3.86-7-7.93s3.06-7.44 7-7.93v15.86zm2 0V13h6.93c-.45 3.61-3.32 6.48-6.93 6.93zM13 11V4.07c3.61.45 6.48 3.32 6.93 6.93H13z"}))
                                         "PieChartTwoTone"))
