(ns reagent-mui.icons.electric-rickshaw-two-tone
  "Imports @mui/icons-material/ElectricRickshawTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def electric-rickshaw-two-tone (create-svg-icon [(e "path" #js {"d" "M3 13h.17c.41-1.16 1.53-2 2.83-2 .35 0 .69.06 1 .17V10H3v3zm16-2h-3v2h1.17c.3-.85.98-1.53 1.83-1.83V11z", "opacity" ".3"}) (e "path" #js {"d" "M21 11.18V9.72c0-.47-.16-.92-.46-1.28L16.6 3.72c-.38-.46-.94-.72-1.54-.72H3c-1.1 0-2 .9-2 2v8c0 1.1.9 2 2 2h.18C3.6 16.16 4.7 17 6 17s2.4-.84 2.82-2h8.37c.41 1.16 1.51 2 2.82 2 1.66 0 3-1.34 3-3-.01-1.3-.85-2.4-2.01-2.82zM6 15c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1zm1-3.83c-.31-.11-.65-.17-1-.17-1.3 0-2.42.84-2.83 2H3v-3h4v1.17zM7 8H3V5h4v3zm7 5H9v-3h3V8H9V5h5v8zm2-6.88L18.4 9H16V6.12zM17.17 13H16v-2h3v.17c-.85.3-1.53.98-1.83 1.83zM20 15c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1zM7 20h4v-2l6 3h-4v2z"})]
                                                 "ElectricRickshawTwoTone"))
