public class \u47c2\u2dcc\u12cb\ud171\u8c8a.\u156b\u2dcc\u97b7\u6bb9\u5245\u392e {
    public void \u156b\u2dcc\u97b7\u6bb9\u5245\u392e() {
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
            invokespecial:Object(Object::<init>, this:\u156b\u2dcc\u97b7\u6bb9\u5245\u392e)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u12b2\u4e72\u8df4\u67e9\u67e9.\ub8be\u7d52\u3dd3\ub171\ud158\ufcaf[] \ufe34\ua562\u983f\u4d85\u7049\u4daf(java.lang.String p0) {
        var_1_5F : int
        var_4_71 : PushbackReader
        var_5_7A : ArrayList<\ub8be\u7d52\u3dd3\ub171\ud158\ufcaf>
        var_1_80 : int
        var_6_86 : int
        var_1_91 : int
        var_7_95 : char
        var_8_D0 : \u59ec\u873d\u12b2\u8df4\u718f\ud158
        
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
        var_1_5F = and:int(ldc:int(37293624), ldc:int(-1951138574))
        var_4_71 = initobject:PushbackReader(PushbackReader::<init>, initobject:StringReader[expected:Reader](StringReader::<init>, p0:String))
        var_5_7A = initobject:ArrayList<\ub8be\u7d52\u3dd3\ub171\ud158\ufcaf>(ArrayList<E>::<init>)
        
        loop {
            var_1_80 = and:int(var_1_5F:int, ldc:int(717085243))
            var_6_86 = invokevirtual:int(PushbackReader::read, var_4_71:PushbackReader)
            
            if (cmplt:boolean(var_6_86:int, ldc:int(0))) {
                return:\ub8be\u7d52\u3dd3\ub171\ud158\ufcaf[](checkcast:\ub8be\u7d52\u3dd3\ub171\ud158\ufcaf[](\u12b2\u4e72\u8df4\u67e9\u67e9.\ub8be\u7d52\u3dd3\ub171\ud158\ufcaf[].class, invokeinterface:\ub8be\u7d52\u3dd3\ub171\ud158\ufcaf[](List<E>::toArray, var_5_7A:ArrayList<\ub8be\u7d52\u3dd3\ub171\ud158\ufcaf>[expected:List<\ub8be\u7d52\u3dd3\ub171\ud158\ufcaf>], newarray:\ub8be\u7d52\u3dd3\ub171\ud158\ufcaf[](\u12b2\u4e72\u8df4\u67e9\u67e9.\ub8be\u7d52\u3dd3\ub171\ud158\ufcaf.class, invokeinterface:int(List<E>::size, var_5_7A:ArrayList<\ub8be\u7d52\u3dd3\ub171\ud158\ufcaf>[expected:List<\ub8be\u7d52\u3dd3\ub171\ud158\ufcaf>])))))
            }
            
            var_1_91 = and:int(var_1_80:int, ldc:int(1659996401))
            var_7_95 = i2c:char(var_6_86:int)
            
            if (logicalnot:boolean(invokestatic:boolean(Character::isWhitespace, var_7_95:char))) {
                var_8_D0 = invokestatic:\u59ec\u873d\u12b2\u8df4\u718f\ud158(\u59ec\u873d\u12b2\u8df4\u718f\ud158::\u9937\uc29a\uc4d2\u8c8a\u4f4a\u960f, var_7_95:char)
                
                if (cmpeq:boolean(var_8_D0:\u59ec\u873d\u12b2\u8df4\u718f\ud158, aconstnull:\u59ec\u873d\u12b2\u8df4\u718f\ud158())) {
                    athrow(initobject:\u7e3f\u1833\u6b5f\u3711\u760c\u67e9(\u7e3f\u1833\u6b5f\u3711\u760c\u67e9::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u156b\u2dcc\u97b7\u6bb9\u5245\u392e::\u4179\u3d64\u9255\u5f50\u88c5\ud4fe), and:int(ldc:int(18437), ldc:int(-18438)))), var_7_95:char), loadelement:String(getstatic:String[](\u156b\u2dcc\u97b7\u6bb9\u5245\u392e::\u4179\u3d64\u9255\u5f50\u88c5\ud4fe), and:int(ldc:int(1181), ldc:int(29441)))), p0:String))))
                }
                
                var_1_91 = and:int(var_1_91:int, ldc:int(-1493751695))
                invokeinterface:boolean(List<\ub8be\u7d52\u3dd3\ub171\ud158\ufcaf>::add, var_5_7A:ArrayList<\ub8be\u7d52\u3dd3\ub171\ud158\ufcaf>[expected:List<\ub8be\u7d52\u3dd3\ub171\ud158\ufcaf>], invokestatic:\ub8be\u7d52\u3dd3\ub171\ud158\ufcaf(\u156b\u2dcc\u97b7\u6bb9\u5245\u392e::\uc2bd\u416d\u946b\u8709\u71f1\u7330, var_7_95:char, var_8_D0:\u59ec\u873d\u12b2\u8df4\u718f\ud158, var_4_71:PushbackReader))
            }
            
            var_1_5F = and:int(var_1_91:int, ldc:int(179547579))
        }
    }
    
    private static \u12b2\u4e72\u8df4\u67e9\u67e9.\ub8be\u7d52\u3dd3\ub171\ud158\ufcaf \uc2bd\u416d\u946b\u8709\u71f1\u7330(char p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u59ec\u873d\u12b2\u8df4\u718f\ud158 p1, java.io.PushbackReader p2) {
        var_3_5F : int
        var_5_67 : StringBuffer
        var_3_74 : int
        var_6_79 : int
        var_7_88 : char
        
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
            var_3_5F = and:int(ldc:int(1023073076), ldc:int(2145294075))
            var_5_67 = initobject:StringBuffer(StringBuffer::<init>)
            invokevirtual:StringBuffer(StringBuffer::append, var_5_67:StringBuffer, p0:char)
            
            loop {
                var_3_74 = and:int(var_3_5F:int, ldc:int(483237633))
                var_6_79 = invokevirtual:int(PushbackReader::read, p2:PushbackReader)
                
                if (cmplt:boolean(var_6_79:int, ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_3_74 = and:int(var_3_74:int, ldc:int(245091902))
                var_7_88 = i2c:char(var_6_79:int)
                
                if (logicalnot:boolean(invokevirtual:boolean(\u59ec\u873d\u12b2\u8df4\u718f\ud158::\u873d\u983f\u873d\u9255\u3bd6\uff55, p1:\u59ec\u873d\u12b2\u8df4\u718f\ud158, var_7_88:char))) {
                    invokevirtual:void(PushbackReader::unread, p2:PushbackReader, var_7_88:char[expected:int])
                    looporswitchbreak()
                }
                
                var_3_5F = and:int(var_3_74:int, ldc:int(771354394))
                invokevirtual:StringBuffer(StringBuffer::append, var_5_67:StringBuffer, var_7_88:char)
            }
            
            return:\ub8be\u7d52\u3dd3\ub171\ud158\ufcaf(initobject:\ub8be\u7d52\u3dd3\ub171\ud158\ufcaf(\ub8be\u7d52\u3dd3\ub171\ud158\ufcaf::<init>, p1:\u59ec\u873d\u12b2\u8df4\u718f\ud158, invokevirtual:String(StringBuffer::toString, var_5_67:StringBuffer)))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_82 : int
        expr_6B : int [generated]
        stack_85_0 : byte[] [generated]
        stack_87_0 : byte[] [generated]
        stack_B1_0 : byte[] [generated]
        stack_B3_0 : byte[] [generated]
        stack_D6_0 : byte[] [generated]
        stack_154_0 : byte[] [generated]
        stack_1B4_0 : byte[] [generated]
        stack_231_0 : byte[] [generated]
        var_4_137 : int
        var_3_13C : byte[]
        var_5_13D : int
        expr_157 : byte [generated]
        var_0_1CC : int
        expr_1B4 : byte [generated]
        stack_200_2 : byte [generated]
        stack_1D7_0 : byte [generated]
        expr_87 : int [generated]
        var_2_B1 : byte[]
        expr_B5 : int [generated]
        var_3_220 : byte[]
        var_5_221 : int
        var_3_E2 : String
        stack_130_0 : String[] [generated]
        expr_F4 : String[] [generated]
        
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
        var_0_82 = and:int(ldc:int(-713272136), ldc:int(-805383013))
        expr_6B = arraylength:int(stack_85_0 = stack_87_0 = stack_B1_0 = stack_B3_0 = stack_D6_0 = stack_154_0 = stack_1B4_0 = stack_231_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("m5y7z0IQkaKyrTRctK+ZOzYvu7u8VtlQQZqb/w==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_137 = expr_6B:int
        var_3_13C = newarray:byte[](byte.class, expr_6B:int)
        var_5_13D = expr_6B:int
        Label_0319:
        
        while (cmpne:boolean(and:int(var_0_82:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_82 = and:int(var_0_82:int, ldc:int(-973226436))
            var_5_13D = add:int(var_5_13D:int, ldc:int(-1))
            expr_157 = add:byte(loadelement:byte(stack_154_0:byte[], var_5_13D:int), ldc:byte(83))
            storeelement:byte(var_3_13C:byte[], var_5_13D:int, xor:int(or:int(and:int(shl:int(expr_157:byte, xor:int(ldc:int(384), ldc:int(388))), ldc:int(-16)), and:int(shr:int(expr_157:byte[expected:int], and:int(ldc:int(708), ldc:int(25645))), ldc:int(15))), ldc:int(16)))
            
            if (cmpne:boolean(var_5_13D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_87_0 = stack_85_0 = stack_B1_0 = stack_B3_0 = stack_D6_0 = stack_154_0 = stack_1B4_0 = stack_231_0 = var_3_13C:byte[]
            goto(Label_0112)
        }
        
        Label_0415:
        
        while (cmpne:boolean(and:int(var_0_82:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_1CC = and:int(var_0_82:int, ldc:int(-167979666))
            var_5_13D = add:int(var_5_13D:int, ldc:int(-1))
            expr_1B4 = stack_200_2 = loadelement(stack_1B4_0, var_5_13D)
            
            if (cmplt:boolean(add:int(add:int(var_5_13D:int, ldc:int(3)), neg:int(var_4_137:int)), ldc:int(0))) {
                stack_200_2 = stack_1D7_0 = add:byte(expr_1B4:byte, loadelement:byte(var_3_13C:byte[], add:int(var_5_13D:int, ldc:int(3))))
                goto(Label_0487)
            }
            
            Label_0449:
            
            if (cmpeq:boolean(and:int(var_0_1CC:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_1CC = and:int(var_0_1CC:int, ldc:int(240525058))
            }
            else {
                var_0_1CC = and:int(var_0_1CC:int, ldc:int(-671132546))
                stack_200_2 = stack_1D7_0 = add:byte(expr_1B4:byte, ldc:byte(3))
            }
            
            Label_0487:
            
            if (cmpeq:boolean(and:int(var_0_1CC:int, ldc:int(4096)), ldc:int(0))) {
                var_0_1CC = and:int(var_0_1CC:int, ldc:int(-1894364017))
                goto(Label_0449)
            }
            
            var_0_82 = and:int(var_0_1CC:int, ldc:int(-847456977))
            storeelement:byte(var_3_13C:byte[], var_5_13D:int, stack_200_2:byte)
            
            if (cmpne:boolean(var_5_13D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_87_0 = stack_85_0 = stack_B1_0 = stack_B3_0 = stack_D6_0 = stack_154_0 = stack_1B4_0 = stack_231_0 = var_3_13C:byte[]
            goto(Label_0140)
        }
        
        goto(Label_0319)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_82:int, ldc:int(4194304)), ldc:int(0))) {
            goto(Label_0186)
        }
        
        if (cmpeq:boolean(and:int(var_0_82:int, ldc:int(256)), ldc:int(0))) {
            var_0_82 = and:int(var_0_82:int, ldc:int(-42140312))
            expr_87 = arraylength:int(stack_87_0:byte[])
            
            if (cmpne:boolean(expr_87:int, ldc:int(0))) {
                var_4_137 = expr_87:int
                var_3_13C = newarray:byte[](byte.class, expr_87:int)
                var_5_13D = expr_87:int
                goto(Label_0415)
            }
        }
        
        Label_0140:
        
        if (cmpeq:boolean(and:int(var_0_82:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_82 = and:int(var_0_82:int, ldc:int(-1222563205))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_82:int, ldc:int(4194304)), ldc:int(0))) {
                var_0_82 = and:int(var_0_82:int, ldc:int(-2143729589))
                goto(Label_0112)
            }
            
            var_0_82 = and:int(var_0_82:int, ldc:int(-444746407))
            var_2_B1 = stack_B1_0:byte[]
            expr_B5 = add:int(arraylength:int(stack_B3_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_B5:int, ldc:int(0))) {
                var_3_220 = newarray:byte[](byte.class, expr_B5:int)
                var_5_221 = expr_B5:int
                
                loop {
                    var_0_82 = and:int(var_0_82:int, ldc:int(-302064325))
                    var_5_221 = add:int(var_5_221:int, ldc:int(-1))
                    storeelement:byte(var_3_220:byte[], var_5_221:int, add:int(shl:int(loadelement:byte(stack_231_0:byte[], var_5_221:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_B1:byte[], add:int(var_5_221:int, xor:int(ldc:int(4484), ldc:int(4485)))), ldc:int(3)), xor:int(ldc:int(16905), ldc:int(16918)))))
                    
                    if (cmpne:boolean(var_5_221:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_87_0 = stack_85_0 = stack_B1_0 = stack_B3_0 = stack_D6_0 = stack_154_0 = stack_1B4_0 = stack_231_0 = var_3_220:byte[]
            }
        }
        
        Label_0186:
        
        if (cmpeq:boolean(and:int(var_0_82:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_82 = and:int(var_0_82:int, ldc:int(-738970910))
            goto(Label_0140)
        }
        
        if (cmpeq:boolean(and:int(var_0_82:int, ldc:int(512)), ldc:int(0))) {
            var_3_E2 = initobject:String(String::<init>, stack_D6_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_130_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(18442), ldc:int(4231)))
            expr_F4 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(10), ldc:int(10311)))
            storeelement:String(expr_F4:String[], xor:int(ldc:int(8325), ldc:int(8324)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(-22667), ldc:int(22658)), and:int(ldc:int(17095), ldc:int(4127))))
            storeelement:String(expr_F4:String[], and:int(ldc:int(-10695), ldc:int(10692)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, xor:int(ldc:int(2311), ldc:int(2304)), and:int(ldc:int(27), ldc:int(16667))))
            putstatic:String[](\u156b\u2dcc\u97b7\u6bb9\u5245\u392e::\u4179\u3d64\u9255\u5f50\u88c5\ud4fe, expr_F4:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \uc31c\u6d99\u0a06\u8709\u93a2\u6c52(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6A3 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_6AE : int
        
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
        var_3_6A3 = and:int(ldc:int(-222191316), ldc:int(2106244396))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u156b\u2dcc\u97b7\u6bb9\u5245\u392e[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-1281294723))
            var_5_7D = and:int(ldc:int(26648), ldc:int(-26651))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(10554), ldc:int(-10555)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_6A3:int, ldc:int(-1196032708))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(-24566), ldc:int(-24565)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(2627), ldc:int(149)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_6A3 = and:int(var_3_D2:int, ldc:int(-1329615188))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(-30714), ldc:int(-30713)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(1714241445))
                        goto(Label_1580)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1415)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-426845362))
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-2139184121))
                        goto(Label_1172)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(540213792))
                        goto(Label_0996)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-308826854))
                        goto(Label_0856)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(478700349))
                        goto(Label_0726)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0588)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(1883749037))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0588)
                            }
                            
                            goto(Label_0856)
                        }
                    }
                    
                    Label_0416:
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-1151470629))
                        goto(Label_1580)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-1856442786))
                        goto(Label_1415)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-1042668738))
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(1650607252))
                        goto(Label_1172)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0996)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0856)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-1233318584))
                        goto(Label_0726)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6A3 = and:int(var_3_6A3:int, ldc:int(1012987631))
                            var_11_E3 = and:int(ldc:int(17872), ldc:int(-21978))
                            goto(Label_1569)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0588:
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(1284209356))
                        goto(Label_1580)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1415)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-1767385630))
                        goto(Label_1172)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-1698388638))
                        goto(Label_0996)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-1080385752))
                        goto(Label_0856)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-1161619362))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0416)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-1398707599))
                            loopcontinue()
                        }
                        
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(855750255))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0856)
                        }
                    }
                    
                    Label_0726:
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1580)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1415)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-1592783675))
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1172)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0996)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6A3 = and:int(var_3_6A3:int, ldc:int(1196417298))
                            goto(Label_0588)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-479094855))
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-955508518))
                            loopcontinue()
                        }
                        
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(2142938300))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0856:
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-166918566))
                        goto(Label_1580)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1415)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-1673838447))
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-1477509155))
                        goto(Label_1172)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(2053490072))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0726)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6A3 = and:int(var_3_6A3:int, ldc:int(647746729))
                            goto(Label_0588)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6A3 = and:int(var_3_6A3:int, ldc:int(474837091))
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(842113903))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(73), ldc:int(1153))
                                goto(Label_1172)
                            }
                        }
                    }
                    
                    Label_0996:
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1580)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(503202046))
                        goto(Label_1415)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-66708596))
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(516454691))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0856)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-126242982))
                            goto(Label_0726)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-400815202))
                            goto(Label_0588)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-1577351312))
                            loopcontinue()
                        }
                        
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(1048492332))
                        var_11_E3 = and:int(ldc:int(-19977), ldc:int(19976))
                    }
                    
                    Label_1172:
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(1675027230))
                        goto(Label_1580)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1415)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0996)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0856)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-1694693350))
                            goto(Label_0726)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6A3 = and:int(var_3_6A3:int, ldc:int(2059655232))
                            goto(Label_0588)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0416)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(963751726))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1415)
                            }
                        }
                    }
                    
                    Label_1284:
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(2116230813))
                        goto(Label_1580)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(829187392))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_1172)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-343739959))
                            goto(Label_0996)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0856)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0726)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0588)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-1175958930))
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-1270422291))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1569)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1415:
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1580)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(1315978956))
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(1216268189))
                        goto(Label_1172)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0996)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(891734701))
                        goto(Label_0856)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0726)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-504081673))
                        goto(Label_0588)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-816377129))
                        goto(Label_0416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(806819799))
                        loopcontinue()
                    }
                    
                    var_3_6A3 = and:int(var_3_6A3:int, ldc:int(1989343743))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1569:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6AE = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1580:
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-1012148556))
                        goto(Label_1415)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-1822828592))
                        goto(Label_1172)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0996)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-1164401309))
                        goto(Label_0856)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-1303753337))
                        goto(Label_0726)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(1562942382))
                        goto(Label_0588)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(1057547518))
                        var_17_6AE = add:int(var_16_111:int, and:int(ldc:int(1035), ldc:int(8801)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6A3 = and:int(var_3_6A3:int, ldc:int(1053794413))
                
                if (cmple:boolean(var_5_7D = var_17_6AE:int, sub:int(var_6_84:int, xor:int(ldc:int(258), ldc:int(259))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(8192)), ldc:int(0))) {
            var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-219505620))
            goto(Label_0106)
        }
    }
}
