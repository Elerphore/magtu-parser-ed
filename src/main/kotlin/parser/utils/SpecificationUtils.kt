package parser.utils

import org.apache.poi.ss.usermodel.Sheet
import parser.Parsing

class SpecificationUtils : Parsing {
    override fun parse(sheet: Sheet) {
        sheet.getRow(0)
            .forEach { cell ->
//                if(cell.dateCellValue != null) println("row: ${cell.address.row} column: ${cell.address.column} value: ${cell.dateCellValue}")
            }
    }
}
