(ns reagent-mui.icons.square-foot-rounded
  "Imports @mui/icons-material/SquareFootRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def square-foot-rounded (create-svg-icon (e "path" #js {"d" "m17.66 17.66-.71.71c-.2.2-.51.2-.71 0-.2-.2-.2-.51 0-.71l.71-.71-1.94-1.94-.71.71c-.2.2-.51.2-.71 0-.2-.2-.2-.51 0-.71l.71-.71-1.94-1.94-.71.71c-.2.2-.51.2-.71 0-.2-.2-.2-.51 0-.71l.71-.71L9.7 9.7l-.71.71c-.2.2-.51.2-.71 0-.2-.2-.2-.51 0-.71l.71-.71-1.94-1.94-.71.71c-.2.2-.51.2-.71 0-.2-.2-.2-.51 0-.71l.71-.71-1.49-1.49c-.31-.31-.85-.09-.85.36V18c0 1.1.9 2 2 2h12.79c.45 0 .67-.54.35-.85l-1.48-1.49zM7 16v-4.76L12.76 17H8c-.55 0-1-.45-1-1z"})
                                          "SquareFootRounded"))
