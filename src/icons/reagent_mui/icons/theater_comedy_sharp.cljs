(ns reagent-mui.icons.theater-comedy-sharp
  "Imports @mui/icons-material/TheaterComedySharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def theater-comedy-sharp (create-svg-icon [(e "path" #js {"d" "M11 2v5.5h3.5v3.31C14.55 9.8 15.64 9 16.99 9c1.38 0 2.5.84 2.5 1.88H14.5v3.56c.76.36 1.61.56 2.5.56 3.31 0 6-2.69 6-6V2H11zm4 5.5c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1zm4 0c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1z"}) (e "path" #js {"d" "M1 16c0 3.31 2.69 6 6 6s6-2.69 6-6V9H1v7zm6 1.88c-1.38 0-2.5-.84-2.5-1.88h5c0 1.04-1.12 1.88-2.5 1.88zm2-5.38c.55 0 1 .45 1 1s-.45 1-1 1-1-.45-1-1 .45-1 1-1zm-4 0c.55 0 1 .45 1 1s-.45 1-1 1-1-.45-1-1 .45-1 1-1z"})]
                                           "TheaterComedySharp"))
