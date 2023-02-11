(ns reagent-mui.icons.macro-off-outlined
  "Imports @mui/icons-material/MacroOffOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def macro-off-outlined (create-svg-icon [(e "path" #js {"d" "M8.66 4.93c.24 0 .46.07.64.2l.81.56c-.29.24-.54.54-.72.87l1.66 1.66C11.03 8.14 11 8.08 11 8c0-.55.45-1 1-1s1 .45 1 1-.45 1-1 1c-.08 0-.14-.03-.22-.04l4.06 4.06c1.49-.24 2.63-1.53 2.63-3.09 0-.71-.25-1.39-.67-1.93.43-.54.67-1.22.67-1.93 0-1.73-1.41-3.14-3.14-3.14-.15 0-.29.01-.43.03C14.44 1.81 13.31 1 12 1s-2.44.81-2.91 1.96c-.14-.02-.29-.03-.43-.03-.8 0-1.53.31-2.09.81l1.42 1.42c.2-.13.42-.23.67-.23zm6.68 6.14c-.24 0-.46-.07-.64-.2l-.81-.57c.55-.45.94-1.09 1.06-1.83l.88.42c.4.19.66.59.66 1.03 0 .64-.52 1.15-1.15 1.15zm-.65-5.94c.2-.13.42-.2.65-.2.63 0 1.14.51 1.14 1.14 0 .44-.25.83-.66 1.03l-.88.42c-.12-.74-.51-1.38-1.07-1.83l.82-.56zM12 3c.62 0 1.12.49 1.14 1.1l-.11 1.09C12.71 5.07 12.36 5 12 5s-.7.07-1.02.19l-.12-1.09c.02-.61.52-1.1 1.14-1.1zm7.98 14.15C20.63 15.91 21 14.5 21 13c-1.5 0-2.91.37-4.15 1.02l3.13 3.13zM3 13c0 4.97 4.03 9 9 9 0-4.97-4.03-9-9-9zm2.44 2.44c1.9.71 3.42 2.22 4.12 4.12-1.9-.71-3.41-2.22-4.12-4.12z"}) (e "path" #js {"d" "M2.81 2.81 1.39 4.22l4.42 4.42c-.19.4-.3.84-.3 1.29 0 1.73 1.41 3.14 3.15 3.14.15 0 .29-.01.43-.03C9.56 14.19 10.69 15 12 15c.05 0 .11-.01.16-.01l1.64 1.64C12.67 18.12 12 19.98 12 22c2.02 0 3.88-.67 5.38-1.8l2.4 2.4 1.41-1.41L2.81 2.81zm11.63 16.75c.2-.54.47-1.04.79-1.5l.72.72c-.47.31-.97.58-1.51.78z"})]
                                         "MacroOffOutlined"))
