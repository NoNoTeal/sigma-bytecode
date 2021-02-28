public class \u927d\u92ff\u71ae\uafe7\u6bb9.\ubefe\u98a4\uc238\u64f2\u3776 {
    public void \ubefe\u98a4\uc238\u64f2\u3776() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:\u9937\ubb2b\u600f\u6b0d\u74b1(\u9937\ubb2b\u600f\u6b0d\u74b1::<init>, this:\ubefe\u98a4\uc238\u64f2\u3776)
            putfield:List<\ua068\ua562\u64f2\u5db4\u494c>(\ubefe\u98a4\uc238\u64f2\u3776::\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab, this:\ubefe\u98a4\uc238\u64f2\u3776, invokestatic:ArrayList[expected:List<\ua068\ua562\u64f2\u5db4\u494c>](Lists::newArrayList))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u927d\u92ff\u71ae\uafe7\u6bb9.\ubefe\u98a4\uc238\u64f2\u3776 \u1187\u759a\u6435\u64ab\u72f1\u8640(java.lang.String p0) {
        var_1_64 : int
        var_3_6C : \ubefe\u98a4\uc238\u64f2\u3776
        var_4_79 : JsonParser
        var_5_89 : JsonObject
        var_6_100 : Iterator
        var_4_185 : Exception
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_1_64 = and:int(and:int(ldc:int(577055885), ldc:int(-544300133)), ldc:int(1803970993))
            var_3_6C = initobject:\ubefe\u98a4\uc238\u64f2\u3776(\ubefe\u98a4\uc238\u64f2\u3776::<init>)
            
            try {
                var_1_64 = and:int(var_1_64:int, ldc:int(1965616325))
                var_4_79 = initobject:JsonParser(JsonParser::<init>)
                var_1_64 = and:int(var_1_64:int, ldc:int(1079928957))
                var_5_89 = invokevirtual:JsonObject(JsonElement::getAsJsonObject, invokevirtual:JsonElement(JsonParser::parse, var_4_79:JsonParser, p0:String))
                
                loop {
                    if (cmpne:boolean(and:int(var_1_64:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0207)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_64:int, ldc:int(268435456)), ldc:int(0))) {
                        var_1_64 = and:int(var_1_64:int, ldc:int(1167415189))
                    }
                    else {
                        var_1_64 = and:int(var_1_64:int, ldc:int(518104785))
                        
                        if (logicalnot:boolean(invokevirtual:boolean(JsonElement::isJsonArray, invokevirtual:JsonElement(JsonObject::get, var_5_89:JsonObject, loadelement:String(getstatic:String[](\ubefe\u98a4\uc238\u64f2\u3776::\u624e\u416d\u97b7\u1187\u8df4\u71ae), and:int(ldc:int(27169), ldc:int(-27170))))))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_0188:
                    
                    if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_1_64:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_1_64 = and:int(var_1_64:int, ldc:int(-1864040503))
                    }
                    
                    Label_0207:
                    
                    if (cmpne:boolean(and:int(var_1_64:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0188)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_64:int, ldc:int(67108864)), ldc:int(0))) {
                        var_1_64 = and:int(var_1_64:int, ldc:int(-567489434))
                    }
                    else {
                        var_1_64 = and:int(var_1_64:int, ldc:int(-1447560675))
                        var_6_100 = invokevirtual:Iterator(JsonArray::iterator, invokevirtual:JsonArray(JsonElement::getAsJsonArray, invokevirtual:JsonElement(JsonObject::get, var_5_89:JsonObject, loadelement:String(getstatic:String[](\ubefe\u98a4\uc238\u64f2\u3776::\u624e\u416d\u97b7\u1187\u8df4\u71ae), and:int(ldc:int(-23299), ldc:int(23042))))))
                        
                        loop {
                            if (cmpne:boolean(and:int(var_1_64:int, ldc:int(67108864)), ldc:int(0))) {
                                var_1_64 = and:int(var_1_64:int, ldc:int(746195097))
                                goto(Label_0322)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(32)), ldc:int(0))) {
                                var_1_64 = and:int(var_1_64:int, ldc:int(862810817))
                                
                                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_6_100:Iterator))) {
                                    looporswitchbreak(Label_0382)
                                }
                            }
                            
                            Label_0295:
                            
                            if (cmpne:boolean(and:int(var_1_64:int, ldc:int(67108864)), ldc:int(0))) {
                                var_1_64 = and:int(var_1_64:int, ldc:int(-1683302926))
                            }
                            else {
                                if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(1)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_1_64 = and:int(var_1_64:int, ldc:int(-2043535175))
                            }
                            
                            Label_0322:
                            
                            if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(1)), ldc:int(0))) {
                                var_1_64 = and:int(var_1_64:int, ldc:int(-1919083377))
                                goto(Label_0295)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_64:int, ldc:int(16)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_1_64 = and:int(var_1_64:int, ldc:int(1885125551))
                            invokeinterface:boolean(List<\ua068\ua562\u64f2\u5db4\u494c>::add, getfield:List<\ua068\ua562\u64f2\u5db4\u494c>(\ubefe\u98a4\uc238\u64f2\u3776::\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab, var_3_6C:\ubefe\u98a4\uc238\u64f2\u3776), invokestatic:\ua068\ua562\u64f2\u5db4\u494c(\ua068\ua562\u64f2\u5db4\u494c::\u6b0d\u56bd\u4c2b\ucfaf\u5245\u8d98, invokevirtual:JsonObject(JsonElement::getAsJsonObject, checkcast:JsonElement(com.google.gson.JsonElement.class, invokeinterface:JsonElement(Iterator<JsonElement>::next, var_6_100:Iterator<JsonElement>)))))
                        }
                    }
                }
                
                Label_0382:
            }
            catch (java.lang.Exception var_4_185) {
                invokeinterface:void(Logger::error, getstatic:Logger(\ubefe\u98a4\uc238\u64f2\u3776::\u34df\u5245\u61a4\u4ab3\u9255\u97b7), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\ubefe\u98a4\uc238\u64f2\u3776::\u624e\u416d\u97b7\u1187\u8df4\u71ae), and:int(ldc:int(4139), ldc:int(24901)))), invokevirtual:String(Throwable::getMessage, var_4_185:Exception[expected:Throwable]))))
            }
            
            return:\ubefe\u98a4\uc238\u64f2\u3776(var_3_6C:\ubefe\u98a4\uc238\u64f2\u3776)
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_198 : int
        expr_6B : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_C7_0 : byte[] [generated]
        stack_C9_0 : byte[] [generated]
        stack_F4_0 : byte[] [generated]
        stack_F6_0 : byte[] [generated]
        stack_11E_0 : byte[] [generated]
        stack_1AA_0 : byte[] [generated]
        stack_229_0 : byte[] [generated]
        stack_27C_0 : byte[] [generated]
        stack_2D1_0 : byte[] [generated]
        var_4_185 : int
        var_3_18A : byte[]
        var_5_18B : int
        var_0_1C2 : int
        expr_1AA : byte [generated]
        stack_1EE_2 : byte [generated]
        stack_1C5_0 : byte [generated]
        expr_229 : byte [generated]
        expr_96 : int [generated]
        var_2_C7 : byte[]
        expr_CB : int [generated]
        var_3_26B : byte[]
        var_5_26C : int
        expr_F6 : int [generated]
        var_3_2C0 : byte[]
        var_5_2C1 : int
        var_3_12A : String
        stack_178_0 : String[] [generated]
        expr_13C : String[] [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_0_198 = and:int(ldc:int(1478280601), ldc:int(-23398133))
        expr_6B = arraylength:int(stack_94_0 = stack_96_0 = stack_C7_0 = stack_C9_0 = stack_F4_0 = stack_F6_0 = stack_11E_0 = stack_1AA_0 = stack_229_0 = stack_27C_0 = stack_2D1_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("9nQ9tAeKvHJEEUCAe7NF1T91wMF6gMm/OcGABcDCf7rBuwXEeUHBgAWQR/s=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_185 = expr_6B:int
        var_3_18A = newarray:byte[](byte.class, expr_6B:int)
        var_5_18B = expr_6B:int
        Label_0397:
        
        while (cmpeq:boolean(and:int(var_0_198:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_1C2 = and:int(var_0_198:int, ldc:int(-97397294))
            var_5_18B = add:int(var_5_18B:int, ldc:int(-1))
            expr_1AA = stack_1EE_2 = loadelement(stack_1AA_0, var_5_18B)
            
            if (cmplt:boolean(add:int(add:int(var_5_18B:int, ldc:int(2)), neg:int(var_4_185:int)), ldc:int(0))) {
                stack_1EE_2 = stack_1C5_0 = add:byte(expr_1AA:byte, loadelement:byte(var_3_18A:byte[], add:int(var_5_18B:int, ldc:int(2))))
                goto(Label_0469)
            }
            
            Label_0439:
            
            if (cmpeq:boolean(and:int(var_0_1C2:int, ldc:int(8388608)), ldc:int(0))) {
                var_0_1C2 = and:int(var_0_1C2:int, ldc:int(2102581129))
                stack_1EE_2 = stack_1C5_0 = add:byte(expr_1AA:byte, ldc:byte(2))
            }
            
            Label_0469:
            
            if (cmpne:boolean(and:int(var_0_1C2:int, ldc:int(65536)), ldc:int(0))) {
                var_0_1C2 = and:int(var_0_1C2:int, ldc:int(-630267090))
                goto(Label_0439)
            }
            
            var_0_198 = and:int(var_0_1C2:int, ldc:int(-562431578))
            storeelement:byte(var_3_18A:byte[], var_5_18B:int, stack_1EE_2:byte)
            
            if (cmpne:boolean(var_5_18B:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C7_0 = stack_C9_0 = stack_F4_0 = stack_F6_0 = stack_11E_0 = stack_1AA_0 = stack_229_0 = stack_27C_0 = stack_2D1_0 = var_3_18A:byte[]
            goto(Label_0112)
        }
        
        var_0_198 = and:int(var_0_198:int, ldc:int(2036644999))
        Label_0532:
        
        while (cmpne:boolean(and:int(var_0_198:int, ldc:int(32768)), ldc:int(0))) {
            var_0_198 = and:int(var_0_198:int, ldc:int(-103365665))
            var_5_18B = add:int(var_5_18B:int, ldc:int(-1))
            expr_229 = loadelement:byte(stack_229_0:byte[], var_5_18B:int)
            storeelement:byte(var_3_18A:byte[], var_5_18B:int, xor:int(or:int(and:int(shl:int(expr_229:byte, xor:int(ldc:int(20497), ldc:int(20501))), ldc:int(-16)), and:int(shr:int(expr_229:byte[expected:int], and:int(ldc:int(3142), ldc:int(29204))), ldc:int(15))), ldc:int(47)))
            
            if (cmpne:boolean(var_5_18B:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C7_0 = stack_C9_0 = stack_F4_0 = stack_F6_0 = stack_11E_0 = stack_1AA_0 = stack_229_0 = stack_27C_0 = stack_2D1_0 = var_3_18A:byte[]
            goto(Label_0155)
        }
        
        goto(Label_0397)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_198:int, ldc:int(65536)), ldc:int(0))) {
            goto(Label_0251)
        }
        
        if (cmpne:boolean(and:int(var_0_198:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_198 = and:int(var_0_198:int, ldc:int(2146318048))
            goto(Label_0208)
        }
        
        if (cmpne:boolean(and:int(var_0_198:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_198 = and:int(var_0_198:int, ldc:int(2074014518))
            expr_96 = arraylength:int(stack_96_0:byte[])
            
            if (cmpne:boolean(expr_96:int, ldc:int(0))) {
                var_4_185 = expr_96:int
                var_3_18A = newarray:byte[](byte.class, expr_96:int)
                var_5_18B = expr_96:int
                goto(Label_0532)
            }
        }
        
        Label_0155:
        
        if (cmpeq:boolean(and:int(var_0_198:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_198 = and:int(var_0_198:int, ldc:int(1587039587))
            goto(Label_0251)
        }
        
        if (cmpne:boolean(and:int(var_0_198:int, ldc:int(65536)), ldc:int(0))) {
            var_0_198 = and:int(var_0_198:int, ldc:int(-826205951))
        }
        else {
            if (cmpne:boolean(and:int(var_0_198:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_198 = and:int(var_0_198:int, ldc:int(2075841479))
            var_2_C7 = stack_C7_0:byte[]
            expr_CB = add:int(arraylength:int(stack_C9_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_CB:int, ldc:int(0))) {
                var_3_26B = newarray:byte[](byte.class, expr_CB:int)
                var_5_26C = expr_CB:int
                
                loop {
                    var_0_198 = and:int(var_0_198:int, ldc:int(1506992556))
                    var_5_26C = add:int(var_5_26C:int, ldc:int(-1))
                    storeelement:byte(var_3_26B:byte[], var_5_26C:int, add:int(shl:int(loadelement:byte(stack_27C_0:byte[], var_5_26C:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_C7:byte[], add:int(var_5_26C:int, xor:int(ldc:int(2176), ldc:int(2177)))), ldc:int(2)), and:int(ldc:int(127), ldc:int(575)))))
                    
                    if (cmpne:boolean(var_5_26C:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_C7_0 = stack_C9_0 = stack_F4_0 = stack_F6_0 = stack_11E_0 = stack_1AA_0 = stack_229_0 = stack_27C_0 = stack_2D1_0 = var_3_26B:byte[]
            }
        }
        
        Label_0208:
        
        if (cmpne:boolean(and:int(var_0_198:int, ldc:int(32768)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_198:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_198 = and:int(var_0_198:int, ldc:int(-204009830))
                goto(Label_0155)
            }
            
            if (cmpne:boolean(and:int(var_0_198:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_198 = and:int(var_0_198:int, ldc:int(-541601923))
            expr_F6 = arraylength:int(stack_F6_0:byte[])
            
            if (cmpne:boolean(expr_F6:int, ldc:int(0))) {
                var_3_2C0 = newarray:byte[](byte.class, expr_F6:int)
                var_5_2C1 = expr_F6:int
                
                loop {
                    var_0_198 = and:int(var_0_198:int, ldc:int(-650386629))
                    var_5_2C1 = add:int(var_5_2C1:int, ldc:int(-1))
                    storeelement:byte(var_3_2C0:byte[], var_5_2C1:int, add:byte(loadelement:byte(stack_2D1_0:byte[], var_5_2C1:int), ldc:byte(119)))
                    
                    if (cmpne:boolean(var_5_2C1:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_C7_0 = stack_C9_0 = stack_F4_0 = stack_F6_0 = stack_11E_0 = stack_1AA_0 = stack_229_0 = stack_27C_0 = stack_2D1_0 = var_3_2C0:byte[]
            }
        }
        
        Label_0251:
        
        if (cmpeq:boolean(and:int(var_0_198:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_198 = and:int(var_0_198:int, ldc:int(-1698799220))
            goto(Label_0208)
        }
        
        if (cmpeq:boolean(and:int(var_0_198:int, ldc:int(16384)), ldc:int(0))) {
            goto(Label_0155)
        }
        
        if (cmpeq:boolean(and:int(var_0_198:int, ldc:int(2048)), ldc:int(0))) {
            var_3_12A = initobject:String(String::<init>, stack_11E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_178_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(4626), ldc:int(26634)))
            expr_13C = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-28623), ldc:int(-28621)))
            storeelement:String(expr_13C:String[], and:int(ldc:int(4513), ldc:int(2119)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(-21022), ldc:int(21017)), and:int(ldc:int(28732), ldc:int(3045))))
            storeelement:String(expr_13C:String[], and:int(ldc:int(-21159), ldc:int(21158)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(6708), ldc:int(422)), and:int(ldc:int(23087), ldc:int(1131))))
            putstatic:String[](\ubefe\u98a4\uc238\u64f2\u3776::\u624e\u416d\u97b7\u1187\u8df4\u71ae, expr_13C:String[])
            putstatic:Logger(\ubefe\u98a4\uc238\u64f2\u3776::\u34df\u5245\u61a4\u4ab3\u9255\u97b7, invokestatic:Logger(LogManager::getLogger))
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u6c52\u983f\u7873\u92ff\ua068\u4c2b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_66F : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C4 : double
        var_3_D6 : int
        var_11_E7 : int
        var_14_111 : double
        var_16_115 : int
        var_12_10D : double
        var_17_67A : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_3_66F = and:int(ldc:int(-122449846), ldc:int(-209201060))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ubefe\u98a4\uc238\u64f2\u3776[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(4096)), ldc:int(0))) {
            var_3_66F = and:int(var_3_66F:int, ldc:int(1938266539))
            var_5_7D = and:int(ldc:int(4568), ldc:int(-4569))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-16581), ldc:int(16580)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C4 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D6 = and:int(var_3_66F:int, ldc:int(1975423535))
                    var_9_C4 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E7 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E7:int, sub:int(var_6_84:int, xor:int(ldc:int(1037), ldc:int(1036)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E7:int, xor:int(ldc:int(2224), ldc:int(2225)))), var_7_93:double))) {
                        inc:int(var_11_E7, ldc:int(1))
                    }
                    
                    var_3_66F = and:int(var_3_D6:int, ldc:int(2078249289))
                    var_14_111 = var_7_93:double
                    var_16_115 = var_11_E7:int
                }
                else {
                    var_11_E7 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(24576), ldc:int(24577)))
                    var_12_10D = var_14_111 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_115 = var_11_E7:int, var_6_84:int)) {
                        var_9_C4 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E7:int)
                        var_16_115 = var_11_E7:int
                        var_14_111 = var_12_10D:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1529)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-1543845160))
                        goto(Label_1376)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1243)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1113)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(231021644))
                        goto(Label_0946)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1840277393))
                        goto(Label_0816)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1016754840))
                        goto(Label_0678)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1109439370))
                        goto(Label_0546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1911461950))
                        
                        if (cmplt:boolean(var_16_115:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0546)
                            }
                            
                            goto(Label_0816)
                        }
                    }
                    
                    Label_0412:
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1529)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1376)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1243)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1113)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0946)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0816)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0678)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1846338513))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(-187451716))
                            var_11_E7 = and:int(ldc:int(-1784), ldc:int(739))
                            goto(Label_1518)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0546:
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(828699368))
                        goto(Label_1529)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(166509272))
                        goto(Label_1376)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1243)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-865042063))
                        goto(Label_1113)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(842478223))
                        goto(Label_0946)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0816)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1146069619))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0412)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-168566887))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_111 = var_9_C4:double
                            goto(Label_0816)
                        }
                    }
                    
                    Label_0678:
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(717110545))
                        goto(Label_1529)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1376)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1243)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-1262893667))
                        goto(Label_1113)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(213424445))
                        goto(Label_0946)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0546)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(-820988783))
                            goto(Label_0412)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(8)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(85240781))
                            loopcontinue()
                        }
                        
                        var_3_66F = and:int(var_3_66F:int, ldc:int(2078005375))
                        var_14_111 = mul:double(ldc:double(0.5), add:double(var_9_C4:double, var_14_111:double))
                    }
                    
                    Label_0816:
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1179114548))
                        goto(Label_1529)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1376)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1243)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-1029030349))
                        goto(Label_1113)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(-816104970))
                            goto(Label_0678)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(-964479509))
                            goto(Label_0546)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0412)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(-265317067))
                            loopcontinue()
                        }
                        
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1905956747))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E7 = and:int(ldc:int(6181), ldc:int(9411))
                                goto(Label_1113)
                            }
                        }
                    }
                    
                    Label_0946:
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(494911655))
                        goto(Label_1529)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1499805480))
                        goto(Label_1376)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1978504240))
                        goto(Label_1243)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-1956122480))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0816)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(-1419129721))
                            goto(Label_0678)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0546)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0412)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1939256125))
                        var_11_E7 = and:int(ldc:int(-31378), ldc:int(31377))
                    }
                    
                    Label_1113:
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-1911998073))
                        goto(Label_1529)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1376)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(8)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(-1852710709))
                            goto(Label_0946)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(729189131))
                            goto(Label_0816)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(1437781577))
                            goto(Label_0678)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0546)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0412)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(-230972693))
                            loopcontinue()
                        }
                        
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-1057364))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E7:int, ldc:int(0))) {
                                goto(Label_1376)
                            }
                        }
                    }
                    
                    Label_1243:
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1529)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(-1140748048))
                            goto(Label_1113)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(1003406654))
                            goto(Label_0946)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(1782750226))
                            goto(Label_0816)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0678)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0546)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0412)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(1)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(485416013))
                            loopcontinue()
                        }
                        
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-108816036))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_111:double, var_5_7D:int, var_16_115:int)
                        goto(Label_1518)
                    }
                    
                    Label_1376:
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1529)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-1228653940))
                        goto(Label_1243)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1113)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0946)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(8)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-624021218))
                        goto(Label_0816)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(300837989))
                        goto(Label_0678)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-688237067))
                        goto(Label_0412)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-1620034400))
                        loopcontinue()
                    }
                    
                    var_3_66F = and:int(var_3_66F:int, ldc:int(2024009816))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_111:double, ldc:double(0.0))
                    Label_1518:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_67A = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E7:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1529:
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(278588645))
                        goto(Label_1376)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-12294702))
                        goto(Label_1243)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1113)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-62596985))
                        goto(Label_0946)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1560543788))
                        goto(Label_0816)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0678)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0412)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(2094461646))
                        var_17_67A = add:int(var_16_115:int, and:int(ldc:int(11403), ldc:int(321)))
                        looporswitchbreak()
                    }
                    
                    var_3_66F = and:int(var_3_66F:int, ldc:int(-568210521))
                }
                
                var_3_66F = and:int(var_3_66F:int, ldc:int(2106324073))
                
                if (cmple:boolean(var_5_7D = var_17_67A:int, sub:int(var_6_84:int, and:int(ldc:int(16389), ldc:int(2851))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_66F = and:int(var_3_66F:int, ldc:int(127880477))
            goto(Label_0106)
        }
    }
}
