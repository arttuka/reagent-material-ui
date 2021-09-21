(ns reagent-mui.icons.change-circle-rounded
  "Imports @mui/icons-material/ChangeCircleRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def change-circle-rounded (create-svg-icon (e "path" #js {"d" "M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm.91 16.15c-.31.31-.85.09-.85-.35V17H12c-1.28 0-2.56-.49-3.54-1.46-1.43-1.43-1.81-3.52-1.14-5.3.19-.51.86-.64 1.24-.25.22.22.27.54.17.82-.46 1.24-.2 2.68.8 3.68.7.7 1.62 1.03 2.54 1.01v-.94c0-.45.54-.67.85-.35l1.62 1.62c.2.2.2.51 0 .71l-1.63 1.61zm2.53-4.13c-.22-.22-.27-.54-.17-.82.46-1.24.2-2.68-.8-3.68-.7-.7-1.62-1.04-2.53-1.02v.94c0 .45-.54.67-.85.35L9.46 8.18c-.2-.2-.2-.51 0-.71l1.62-1.62c.31-.31.85-.09.85.35v.81c1.3-.02 2.61.45 3.6 1.45 1.43 1.43 1.81 3.52 1.14 5.3-.19.52-.85.65-1.23.26z"})
                                            "ChangeCircleRounded"))
