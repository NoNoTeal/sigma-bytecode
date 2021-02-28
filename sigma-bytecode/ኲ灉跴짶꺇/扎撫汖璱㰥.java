public class \u12b2\u7049\u8df4\uc9f6\uae87.\u624e\u64ab\u6c56\u74b1\u3c25 {
    public void \u624e\u64ab\u6c56\u74b1\u3c25(boolean p0, double p1) {
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
            invokespecial:Object(Object::<init>, this:\u624e\u64ab\u6c56\u74b1\u3c25)
            putfield:boolean(\u624e\u64ab\u6c56\u74b1\u3c25::\u8cae\uc3e3\uc31c\u8d90\u12b2\u927d, this:\u624e\u64ab\u6c56\u74b1\u3c25, p0:boolean)
            putfield:double(\u624e\u64ab\u6c56\u74b1\u3c25::\u92ff\u8258\u74b1\uc4d2\u97b7\u4ab3, this:\u624e\u64ab\u6c56\u74b1\u3c25, p1:double)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public double \u51fa\u3c25\u40a9\u8aa5\uc2bd\u839e(double p0) {
        var_3_5F : int
        stack_82_0 : double [generated]
        
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
            var_3_5F = and:int(ldc:int(1512083098), ldc:int(2064879455))
            
            if (logicalnot:boolean(getfield:boolean(\u624e\u64ab\u6c56\u74b1\u3c25::\u8cae\uc3e3\uc31c\u8d90\u12b2\u927d, this:\u624e\u64ab\u6c56\u74b1\u3c25))) {
                var_3_5F = and:int(var_3_5F:int, ldc:int(379961150))
                stack_82_0 = getfield:double(\u624e\u64ab\u6c56\u74b1\u3c25::\u92ff\u8258\u74b1\uc4d2\u97b7\u4ab3, this:\u624e\u64ab\u6c56\u74b1\u3c25)
            }
            else {
                stack_82_0 = add:double(getfield:double(\u624e\u64ab\u6c56\u74b1\u3c25::\u92ff\u8258\u74b1\uc4d2\u97b7\u4ab3, this:\u624e\u64ab\u6c56\u74b1\u3c25), p0:double)
            }
            
            return:double(stack_82_0:double)
        }
        
        goto(Label_0006)
    }
    
    public static \u12b2\u7049\u8df4\uc9f6\uae87.\u624e\u64ab\u6c56\u74b1\u3c25 \u69d9\ud4fe\ub18d\u56bd\ucef1\ub18d(com.mojang.brigadier.StringReader p0, boolean p1) {
        var_2_5F : int
        var_2_72 : int
        var_2_95 : int
        var_4_9A : boolean
        var_5_A0 : int
        stack_FD_0 : double [generated]
        var_6_FD : double
        var_8_10C : String
        
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
        var_2_5F = and:int(ldc:int(-735778293), ldc:int(-538484166))
        
        if (invokevirtual:boolean(StringReader::canRead, p0:StringReader)) {
            if (cmpeq:boolean(invokevirtual:char(StringReader::peek, p0:StringReader), ldc:char(94))) {
                athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::createWithContext, getstatic:SimpleCommandExceptionType(\u4f52\u873d\u5bc4\u647c\u4c2b::\u6c56\uafe7\uf995\ud523\u7006\u6b0d), p0:StringReader[expected:ImmutableStringReader]))
            }
        }
        
        loop {
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(2097152)), ldc:int(0))) {
                var_2_72 = and:int(var_2_5F:int, ldc:int(-1215838426))
            }
            else {
                var_2_72 = and:int(var_2_5F:int, ldc:int(-893953140))
                
                if (logicalnot:boolean(invokevirtual:boolean(StringReader::canRead, p0:StringReader))) {
                    athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::createWithContext, getstatic:SimpleCommandExceptionType(\u624e\u64ab\u6c56\u74b1\u3c25::\u6b5f\u8753\u8709\u12b2\u99f7\u4975), p0:StringReader[expected:ImmutableStringReader]))
                }
            }
            
            if (cmpeq:boolean(and:int(var_2_72:int, ldc:int(512)), ldc:int(0))) {
                var_2_5F = and:int(var_2_72:int, ldc:int(487686954))
            }
            else {
                var_2_95 = and:int(var_2_72:int, ldc:int(-999210054))
                var_4_9A = invokestatic:boolean(\u624e\u64ab\u6c56\u74b1\u3c25::\u8c8a\uf995\ua61f\u4179\ua6bd\u494c, p0:StringReader)
                var_5_A0 = invokevirtual:int(StringReader::getCursor, p0:StringReader)
                
                if (logicaland:boolean(invokevirtual:boolean(StringReader::canRead, p0:StringReader), cmpne:boolean(invokevirtual:char(StringReader::peek, p0:StringReader), ldc:char(32)))) {
                    stack_FD_0 = invokevirtual:double(StringReader::readDouble, p0:StringReader)
                }
                else {
                    var_2_95 = and:int(var_2_95:int, ldc:int(-923935048))
                    stack_FD_0 = ldc:double(0.0)
                }
                
                var_6_FD = stack_FD_0:double
                var_8_10C = invokevirtual:String(String::substring, invokevirtual:String(StringReader::getString, p0:StringReader), var_5_A0:int, invokevirtual:int(StringReader::getCursor, p0:StringReader))
                
                if (logicaland:boolean(var_4_9A:boolean, invokevirtual:boolean(String::isEmpty, var_8_10C:String))) {
                    return:\u624e\u64ab\u6c56\u74b1\u3c25(initobject:\u624e\u64ab\u6c56\u74b1\u3c25(\u624e\u64ab\u6c56\u74b1\u3c25::<init>, xor:int[expected:boolean](ldc:int(-31744), ldc:int(-31743)), ldc:double(0.0)))
                }
                
                if (logicalnot:boolean(invokevirtual:boolean(String::contains, var_8_10C:String, loadelement:String[expected:CharSequence](getstatic:String[](\u624e\u64ab\u6c56\u74b1\u3c25::\uc84e\u516c\ub7dc\u516c\ua6bd\u64ab), and:int(ldc:int(3688), ldc:int(-3689)))))) {
                    if (logicalnot:boolean(var_4_9A:boolean)) {
                        if (p1:boolean) {
                            var_6_FD = add:double(var_6_FD:double, ldc:double(0.5))
                        }
                    }
                }
                
                return:\u624e\u64ab\u6c56\u74b1\u3c25(initobject:\u624e\u64ab\u6c56\u74b1\u3c25(\u624e\u64ab\u6c56\u74b1\u3c25::<init>, var_4_9A:boolean, var_6_FD:double))
            }
        }
    }
    
    public static \u12b2\u7049\u8df4\uc9f6\uae87.\u624e\u64ab\u6c56\u74b1\u3c25 \u416d\ua068\u718f\u946b\u8d90\u4f52(com.mojang.brigadier.StringReader p0) {
        var_1_5F : int
        var_1_72 : int
        var_1_115 : int
        var_3_9A : boolean
        stack_12B_0 : double [generated]
        var_4_B7 : double
        
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
        var_1_5F = and:int(ldc:int(142386609), ldc:int(-1191185414))
        
        if (invokevirtual:boolean(StringReader::canRead, p0:StringReader)) {
            if (cmpeq:boolean(invokevirtual:char(StringReader::peek, p0:StringReader), ldc:char(94))) {
                athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::createWithContext, getstatic:SimpleCommandExceptionType(\u4f52\u873d\u5bc4\u647c\u4c2b::\u6c56\uafe7\uf995\ud523\u7006\u6b0d), p0:StringReader[expected:ImmutableStringReader]))
            }
        }
        
        loop {
            if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(32)), ldc:int(0))) {
                var_1_72 = and:int(var_1_5F:int, ldc:int(178831125))
            }
            else {
                var_1_72 = and:int(var_1_5F:int, ldc:int(-1948061776))
                
                if (logicalnot:boolean(invokevirtual:boolean(StringReader::canRead, p0:StringReader))) {
                    athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::createWithContext, getstatic:SimpleCommandExceptionType(\u624e\u64ab\u6c56\u74b1\u3c25::\uc238\u5d20\u8753\u8308\u7af6\uc87f), p0:StringReader[expected:ImmutableStringReader]))
                }
            }
            
            if (cmpeq:boolean(and:int(var_1_72:int, ldc:int(4096)), ldc:int(0))) {
                var_1_115 = and:int(var_1_72:int, ldc:int(1977650173))
                var_3_9A = invokestatic:boolean(\u624e\u64ab\u6c56\u74b1\u3c25::\u8c8a\uf995\ua61f\u4179\ua6bd\u494c, p0:StringReader)
                
                if (invokevirtual:boolean(StringReader::canRead, p0:StringReader)) {
                    if (cmpne:boolean(invokevirtual:char(StringReader::peek, p0:StringReader), ldc:char(32))) {
                        if (logicalnot:boolean(var_3_9A:boolean)) {
                            goto(Label_0258)
                        }
                        
                        stack_12B_0 = invokevirtual:double(StringReader::readDouble, p0:StringReader)
                        goto(Label_0294)
                    }
                }
                
                Label_0162:
                
                if (cmpeq:boolean(and:int(var_1_115:int, ldc:int(16384)), ldc:int(0))) {
                    var_4_B7 = ldc:double(0.0)
                    return:\u624e\u64ab\u6c56\u74b1\u3c25(initobject:\u624e\u64ab\u6c56\u74b1\u3c25(\u624e\u64ab\u6c56\u74b1\u3c25::<init>, var_3_9A:boolean, var_4_B7:double))
                }
                
                var_1_115 = and:int(var_1_115:int, ldc:int(-96466684))
                Label_0258:
                
                if (cmpeq:boolean(and:int(var_1_115:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_115 = and:int(var_1_115:int, ldc:int(-1628763778))
                    goto(Label_0162)
                }
                
                var_1_115 = and:int(var_1_115:int, ldc:int(-1528256014))
                stack_12B_0 = i2d:double(invokevirtual:int(StringReader::readInt, p0:StringReader))
                Label_0294:
                var_4_B7 = stack_12B_0:double
                return:\u624e\u64ab\u6c56\u74b1\u3c25(initobject:\u624e\u64ab\u6c56\u74b1\u3c25(\u624e\u64ab\u6c56\u74b1\u3c25::<init>, var_3_9A:boolean, var_4_B7:double))
            }
            
            var_1_5F = and:int(var_1_72:int, ldc:int(-624727240))
        }
    }
    
    public static boolean \u8c8a\uf995\ua61f\u4179\ua6bd\u494c(com.mojang.brigadier.StringReader p0) {
        var_1_5F : int
        var_3_75 : int
        
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
            var_1_5F = and:int(ldc:int(-993652518), ldc:int(1970009466))
            
            if (cmpne:boolean(invokevirtual:char(StringReader::peek, p0:StringReader), ldc:char(126))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(1735015262))
                var_3_75 = and:int(ldc:int(2907), ldc:int(-19292))
            }
            else {
                var_3_75 = and:int(ldc:int(8201), ldc:int(16741))
                invokevirtual:void(StringReader::skip, p0:StringReader)
            }
            
            return:boolean(var_3_75:int)
        }
        
        goto(Label_0006)
    }
    
    public boolean equals(java.lang.Object p0) {
        var_2_5F : int
        var_2_C4 : int
        var_4_88 : \u624e\u64ab\u6c56\u74b1\u3c25
        stack_10C_0 : int [generated]
        
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
        var_2_5F = and:int(ldc:int(1665138598), ldc:int(-270633290))
        
        if (cmpeq:boolean(this:\u624e\u64ab\u6c56\u74b1\u3c25[expected:Object], p0:Object)) {
            return:boolean(and:int[expected:boolean](ldc:int(149), ldc:int(5899)))
        }
        
        do {
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(1073741824)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-432375186))
                
                if (instanceof:boolean(\u12b2\u7049\u8df4\uc9f6\uae87.\u624e\u64ab\u6c56\u74b1\u3c25.class, p0:Object)) {
                    loopcontinue()
                }
                
                return:boolean(and:int[expected:boolean](ldc:int(-32595), ldc:int(15170)))
            }
        } while (cmpne:boolean(and:int(var_2_5F:int, ldc:int(67108864)), ldc:int(0)))
        
        var_2_C4 = and:int(var_2_5F:int, ldc:int(-424773002))
        var_4_88 = checkcast:\u624e\u64ab\u6c56\u74b1\u3c25(\u12b2\u7049\u8df4\uc9f6\uae87.\u624e\u64ab\u6c56\u74b1\u3c25.class, p0:Object[expected:\u624e\u64ab\u6c56\u74b1\u3c25])
        
        if (cmpeq:boolean(getfield:boolean(\u624e\u64ab\u6c56\u74b1\u3c25::\u8cae\uc3e3\uc31c\u8d90\u12b2\u927d, this:\u624e\u64ab\u6c56\u74b1\u3c25), getfield:boolean(\u624e\u64ab\u6c56\u74b1\u3c25::\u8cae\uc3e3\uc31c\u8d90\u12b2\u927d, var_4_88:\u624e\u64ab\u6c56\u74b1\u3c25))) {
            loop {
                if (cmpeq:boolean(and:int(var_2_C4:int, ldc:int(67108864)), ldc:int(0))) {
                    var_2_C4 = and:int(var_2_C4:int, ldc:int(2057174823))
                    
                    if (cmpeq:boolean(invokestatic:int(Double::compare, getfield:double(\u624e\u64ab\u6c56\u74b1\u3c25::\u92ff\u8258\u74b1\uc4d2\u97b7\u4ab3, var_4_88:\u624e\u64ab\u6c56\u74b1\u3c25), getfield:double(\u624e\u64ab\u6c56\u74b1\u3c25::\u92ff\u8258\u74b1\uc4d2\u97b7\u4ab3, this:\u624e\u64ab\u6c56\u74b1\u3c25)), ldc:int(0))) {
                        stack_10C_0 = xor:int(ldc:int(5640), ldc:int(5641))
                        looporswitchbreak()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_2_C4:int, ldc:int(268435456)), ldc:int(0))) {
                    var_2_C4 = and:int(var_2_C4:int, ldc:int(-501547345))
                    stack_10C_0 = and:int(ldc:int(29984), ldc:int(-29993))
                    looporswitchbreak()
                }
                
                var_2_C4 = and:int(var_2_C4:int, ldc:int(-622204450))
            }
            
            return:boolean(stack_10C_0:int)
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(23367), ldc:int(-23496)))
    }
    
    public int hashCode() {
        var_1_5F : int
        stack_86_0 : int [generated]
        var_3_86 : int
        var_4_8E : long
        
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
            var_1_5F = and:int(ldc:int(1534815427), ldc:int(1845079727))
            
            if (logicalnot:boolean(getfield:boolean(\u624e\u64ab\u6c56\u74b1\u3c25::\u8cae\uc3e3\uc31c\u8d90\u12b2\u927d, this:\u624e\u64ab\u6c56\u74b1\u3c25))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-335962905))
                stack_86_0 = and:int(ldc:int(-32437), ldc:int(32272))
            }
            else {
                stack_86_0 = and:int(ldc:int(19013), ldc:int(9347))
            }
            
            var_3_86 = stack_86_0:int
            var_4_8E = invokestatic:long(Double::doubleToLongBits, getfield:double(\u624e\u64ab\u6c56\u74b1\u3c25::\u92ff\u8258\u74b1\uc4d2\u97b7\u4ab3, this:\u624e\u64ab\u6c56\u74b1\u3c25))
            return:int(add:int(mul:int(ldc:int(31), var_3_86:int), l2i:int(xor:long(var_4_8E:long, ushr:long(var_4_8E:long, ldc:int(32))))))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u8c8a\uf995\ua61f\u4179\ua6bd\u494c() {
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
            return:boolean(getfield:boolean(\u624e\u64ab\u6c56\u74b1\u3c25::\u8cae\uc3e3\uc31c\u8d90\u12b2\u927d, this:\u624e\u64ab\u6c56\u74b1\u3c25))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1ED : int
        expr_6B : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_CF_0 : byte[] [generated]
        stack_D1_0 : byte[] [generated]
        stack_FC_0 : byte[] [generated]
        stack_FE_0 : byte[] [generated]
        stack_126_0 : byte[] [generated]
        stack_1FF_0 : byte[] [generated]
        stack_264_0 : byte[] [generated]
        stack_2DA_0 : byte[] [generated]
        stack_330_0 : byte[] [generated]
        var_4_1DA : int
        var_3_1DF : byte[]
        var_5_1E0 : int
        expr_202 : byte [generated]
        var_0_27C : int
        expr_264 : byte [generated]
        stack_2A8_2 : byte [generated]
        stack_27F_0 : byte [generated]
        expr_96 : int [generated]
        var_2_CF : byte[]
        expr_D3 : int [generated]
        var_3_2C8 : byte[]
        var_5_2C9 : int
        expr_FE : int [generated]
        var_3_31E : byte[]
        var_5_31F : int
        var_3_132 : String
        expr_13A : String[] [generated]
        expr_144 : String[] [generated]
        var_3_19F : String[]
        
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
        var_0_1ED = and:int(ldc:int(63233379), ldc:int(893942111))
        expr_6B = arraylength:int(stack_94_0 = stack_96_0 = stack_CF_0 = stack_D1_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_1FF_0 = stack_264_0 = stack_2DA_0 = stack_330_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("IJm5Ekm5QsTayLHEcfgS6plpUbzKwEKhgbGhUpG5Ekm5QsTayLHEcfgS6plpUbwqyNp0/Kk=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1DA = expr_6B:int
        var_3_1DF = newarray:byte[](byte.class, expr_6B:int)
        var_5_1E0 = expr_6B:int
        Label_0482:
        
        while (cmpeq:boolean(and:int(var_0_1ED:int, ldc:int(524288)), ldc:int(0))) {
            var_0_1ED = and:int(var_0_1ED:int, ldc:int(-1485030967))
            var_5_1E0 = add:int(var_5_1E0:int, ldc:int(-1))
            expr_202 = add:byte(loadelement:byte(stack_1FF_0:byte[], var_5_1E0:int), ldc:byte(70))
            storeelement:byte(var_3_1DF:byte[], var_5_1E0:int, or:int(and:int(shl:int(expr_202:byte, xor:int(ldc:int(1291), ldc:int(1295))), ldc:int(-16)), and:int(shr:int(expr_202:byte[expected:int], xor:int(ldc:int(4608), ldc:int(4612))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_1E0:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_CF_0 = stack_D1_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_1FF_0 = stack_264_0 = stack_2DA_0 = stack_330_0 = var_3_1DF:byte[]
            goto(Label_0112)
        }
        
        var_0_1ED = and:int(var_0_1ED:int, ldc:int(-1507972599))
        Label_0583:
        
        while (cmpeq:boolean(and:int(var_0_1ED:int, ldc:int(16)), ldc:int(0))) {
            var_0_27C = and:int(var_0_1ED:int, ldc:int(-1017382798))
            var_5_1E0 = add:int(var_5_1E0:int, ldc:int(-1))
            expr_264 = stack_2A8_2 = loadelement(stack_264_0, var_5_1E0)
            
            if (cmplt:boolean(add:int(add:int(var_5_1E0:int, ldc:int(2)), neg:int(var_4_1DA:int)), ldc:int(0))) {
                stack_2A8_2 = stack_27F_0 = add:byte(expr_264:byte, loadelement:byte(var_3_1DF:byte[], add:int(var_5_1E0:int, ldc:int(2))))
                goto(Label_0655)
            }
            
            Label_0625:
            
            if (cmpeq:boolean(and:int(var_0_27C:int, ldc:int(512)), ldc:int(0))) {
                var_0_27C = and:int(var_0_27C:int, ldc:int(-113239596))
                stack_2A8_2 = stack_27F_0 = add:byte(expr_264:byte, ldc:byte(2))
            }
            
            Label_0655:
            
            if (cmpne:boolean(and:int(var_0_27C:int, ldc:int(1048576)), ldc:int(0))) {
                var_0_27C = and:int(var_0_27C:int, ldc:int(231317822))
                goto(Label_0625)
            }
            
            var_0_1ED = and:int(var_0_27C:int, ldc:int(208690163))
            storeelement:byte(var_3_1DF:byte[], var_5_1E0:int, stack_2A8_2:byte)
            
            if (cmpne:boolean(var_5_1E0:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_CF_0 = stack_D1_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_1FF_0 = stack_264_0 = stack_2DA_0 = stack_330_0 = var_3_1DF:byte[]
            goto(Label_0155)
        }
        
        var_0_1ED = and:int(var_0_1ED:int, ldc:int(-582481050))
        goto(Label_0482)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_1ED:int, ldc:int(8)), ldc:int(0))) {
            goto(Label_0259)
        }
        
        if (cmpne:boolean(and:int(var_0_1ED:int, ldc:int(512)), ldc:int(0))) {
            goto(Label_0216)
        }
        
        if (cmpne:boolean(and:int(var_0_1ED:int, ldc:int(65536)), ldc:int(0))) {
            var_0_1ED = and:int(var_0_1ED:int, ldc:int(-208546762))
        }
        else {
            var_0_1ED = and:int(var_0_1ED:int, ldc:int(574404682))
            expr_96 = arraylength:int(stack_96_0:byte[])
            
            if (cmpne:boolean(expr_96:int, ldc:int(0))) {
                var_4_1DA = expr_96:int
                var_3_1DF = newarray:byte[](byte.class, expr_96:int)
                var_5_1E0 = expr_96:int
                goto(Label_0583)
            }
        }
        
        Label_0155:
        
        if (cmpne:boolean(and:int(var_0_1ED:int, ldc:int(524288)), ldc:int(0))) {
            var_0_1ED = and:int(var_0_1ED:int, ldc:int(2065113985))
            goto(Label_0259)
        }
        
        if (cmpeq:boolean(and:int(var_0_1ED:int, ldc:int(64)), ldc:int(0))) {
            var_0_1ED = and:int(var_0_1ED:int, ldc:int(-1056110615))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_1ED:int, ldc:int(2048)), ldc:int(0))) {
                var_0_1ED = and:int(var_0_1ED:int, ldc:int(2061519610))
                goto(Label_0112)
            }
            
            var_0_1ED = and:int(var_0_1ED:int, ldc:int(-1665148330))
            var_2_CF = stack_CF_0:byte[]
            expr_D3 = add:int(arraylength:int(stack_D1_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_D3:int, ldc:int(0))) {
                var_3_2C8 = newarray:byte[](byte.class, expr_D3:int)
                var_5_2C9 = expr_D3:int
                
                loop {
                    var_0_1ED = and:int(var_0_1ED:int, ldc:int(487628796))
                    var_5_2C9 = add:int(var_5_2C9:int, ldc:int(-1))
                    storeelement:byte(var_3_2C8:byte[], var_5_2C9:int, add:int(shl:int(loadelement:byte(stack_2DA_0:byte[], var_5_2C9:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_CF:byte[], add:int(var_5_2C9:int, xor:int(ldc:int(10240), ldc:int(10241)))), ldc:int(7)), xor:int(ldc:int(720), ldc:int(721)))))
                    
                    if (cmpne:boolean(var_5_2C9:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_CF_0 = stack_D1_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_1FF_0 = stack_264_0 = stack_2DA_0 = stack_330_0 = var_3_2C8:byte[]
            }
        }
        
        Label_0216:
        
        if (cmpeq:boolean(and:int(var_0_1ED:int, ldc:int(16)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1ED:int, ldc:int(2048)), ldc:int(0))) {
                goto(Label_0155)
            }
            
            if (cmpeq:boolean(and:int(var_0_1ED:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_1ED = and:int(var_0_1ED:int, ldc:int(-1959942886))
                goto(Label_0112)
            }
            
            var_0_1ED = and:int(var_0_1ED:int, ldc:int(-202761489))
            expr_FE = arraylength:int(stack_FE_0:byte[])
            
            if (cmpne:boolean(expr_FE:int, ldc:int(0))) {
                var_3_31E = newarray:byte[](byte.class, expr_FE:int)
                var_5_31F = expr_FE:int
                
                loop {
                    var_0_1ED = and:int(var_0_1ED:int, ldc:int(-166913589))
                    var_5_31F = add:int(var_5_31F:int, ldc:int(-1))
                    storeelement:byte(var_3_31E:byte[], var_5_31F:int, xor:byte(loadelement:byte(stack_330_0:byte[], var_5_31F:int), ldc:byte(56)))
                    
                    if (cmpne:boolean(var_5_31F:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_CF_0 = stack_D1_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_1FF_0 = stack_264_0 = stack_2DA_0 = stack_330_0 = var_3_31E:byte[]
            }
        }
        
        Label_0259:
        
        if (cmpne:boolean(and:int(var_0_1ED:int, ldc:int(16)), ldc:int(0))) {
            goto(Label_0216)
        }
        
        if (cmpne:boolean(and:int(var_0_1ED:int, ldc:int(65536)), ldc:int(0))) {
            goto(Label_0155)
        }
        
        if (cmpeq:boolean(and:int(var_0_1ED:int, ldc:int(64)), ldc:int(0))) {
            var_0_1ED = and:int(var_0_1ED:int, ldc:int(399307526))
            goto(Label_0112)
        }
        
        var_3_132 = initobject:String(String::<init>, stack_126_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        expr_13A = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(279), ldc:int(276)))
        expr_144 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-29184), ldc:int(-29181)))
        storeelement:String(expr_144:String[], and:int(ldc:int(25619), ldc:int(-29856)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(-23290), ldc:int(19192)), xor:int(ldc:int(320), ldc:int(321))))
        storeelement:String(expr_13A:String[], xor:int(ldc:int(16584), ldc:int(16585)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(2053), ldc:int(16715)), xor:int(ldc:int(-14331), ldc:int(-14311))))
        storeelement:String(expr_13A:String[], xor:int(ldc:int(804), ldc:int(806)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(924), ldc:int(25628)), and:int(ldc:int(1087), ldc:int(6772))))
        putstatic:String[](\u624e\u64ab\u6c56\u74b1\u3c25::\uc84e\u516c\ub7dc\u516c\ua6bd\u64ab, expr_144:String[])
        var_3_19F = expr_13A:String[]
        putstatic:SimpleCommandExceptionType(\u624e\u64ab\u6c56\u74b1\u3c25::\u6b5f\u8753\u8709\u12b2\u99f7\u4975, initobject:SimpleCommandExceptionType(SimpleCommandExceptionType::<init>, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_19F:String[], and:int(ldc:int(4099), ldc:int(29))))))
        putstatic:SimpleCommandExceptionType(\u624e\u64ab\u6c56\u74b1\u3c25::\uc238\u5d20\u8753\u8308\u7af6\uc87f, initobject:SimpleCommandExceptionType(SimpleCommandExceptionType::<init>, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_19F:String[], xor:int(ldc:int(321), ldc:int(323))))))
    }
    
    public void \u0b8e\u839e\ud4fe\ua61f\uff55\ubcb0(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_613 : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_BD : double
        var_3_CF : int
        var_11_E0 : int
        var_14_10A : double
        var_16_10E : int
        var_12_106 : double
        var_17_61E : int
        
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
        var_3_613 = and:int(ldc:int(787939679), ldc:int(-1733848133))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u624e\u64ab\u6c56\u74b1\u3c25[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_613 = and:int(var_3_613:int, ldc:int(-2013830531))
            var_5_80 = and:int(ldc:int(10784), ldc:int(-10785))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-18316), ldc:int(18315)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BD = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CF = and:int(var_3_613:int, ldc:int(-1381169377))
                    var_9_BD = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E0 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E0:int, sub:int(var_6_87:int, xor:int(ldc:int(-32592), ldc:int(-32591)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E0:int, and:int(ldc:int(12421), ldc:int(19273)))), var_7_96:double))) {
                        inc:int(var_11_E0, ldc:int(1))
                    }
                    
                    var_3_613 = and:int(var_3_CF:int, ldc:int(-39062183))
                    var_14_10A = var_7_96:double
                    var_16_10E = var_11_E0:int
                }
                else {
                    var_11_E0 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), and:int(ldc:int(4609), ldc:int(10345)))
                    var_12_106 = var_14_10A = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_10E = var_11_E0:int, var_6_87:int)) {
                        var_9_BD = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E0:int)
                        var_16_10E = var_11_E0:int
                        var_14_10A = var_12_106:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1430)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1149)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(1641298083))
                        goto(Label_1032)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(512)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(833189097))
                        goto(Label_0879)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(-1149033059))
                        goto(Label_0779)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0661)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(1104771781))
                        goto(Label_0552)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(-1833355975))
                        
                        if (cmplt:boolean(var_16_10E:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0552)
                            }
                            
                            goto(Label_0779)
                        }
                    }
                    
                    Label_0394:
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(-407981409))
                        goto(Label_1430)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1149)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1032)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0779)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(1256158527))
                        goto(Label_0661)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(-6957871))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_613 = and:int(var_3_613:int, ldc:int(1531072609))
                            loopcontinue()
                        }
                        
                        var_3_613 = and:int(var_3_613:int, ldc:int(-289672453))
                        var_11_E0 = and:int(ldc:int(8338), ldc:int(-8339))
                        goto(Label_1419)
                    }
                    
                    Label_0552:
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1430)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(128)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(307673485))
                        goto(Label_1149)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1032)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(-1228733137))
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(8)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(-1331835113))
                        goto(Label_0779)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0394)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_613 = and:int(var_3_613:int, ldc:int(-709685091))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10A = var_9_BD:double
                            goto(Label_0779)
                        }
                    }
                    
                    Label_0661:
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1430)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1149)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(-1858259388))
                        goto(Label_1032)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(1)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(-156112897))
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0552)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(16)), ldc:int(0))) {
                            var_3_613 = and:int(var_3_613:int, ldc:int(-324115930))
                            goto(Label_0394)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_613 = and:int(var_3_613:int, ldc:int(-1612117729))
                        var_14_10A = mul:double(ldc:double(0.5), add:double(var_9_BD:double, var_14_10A:double))
                    }
                    
                    Label_0779:
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1430)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1149)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1032)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(-1583674739))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(32)), ldc:int(0))) {
                            var_3_613 = and:int(var_3_613:int, ldc:int(494122756))
                            goto(Label_0661)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0552)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0394)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_613 = and:int(var_3_613:int, ldc:int(-723159009))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E0 = xor:int(ldc:int(17), ldc:int(16))
                                goto(Label_1032)
                            }
                        }
                    }
                    
                    Label_0879:
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1430)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(890477712))
                        goto(Label_1288)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(-113927501))
                        goto(Label_1149)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0779)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0661)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_613 = and:int(var_3_613:int, ldc:int(-278078861))
                            goto(Label_0552)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_613 = and:int(var_3_613:int, ldc:int(1576537601))
                            goto(Label_0394)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_613 = and:int(var_3_613:int, ldc:int(1201914621))
                        var_11_E0 = and:int(ldc:int(17541), ldc:int(-21926))
                    }
                    
                    Label_1032:
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1430)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(482609674))
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(16)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(-1311763197))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_613 = and:int(var_3_613:int, ldc:int(-873148184))
                            goto(Label_0879)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0779)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(512)), ldc:int(0))) {
                            var_3_613 = and:int(var_3_613:int, ldc:int(1745966495))
                            goto(Label_0661)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0552)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0394)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_613 = and:int(var_3_613:int, ldc:int(1336753341))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E0:int, ldc:int(0))) {
                                goto(Label_1288)
                            }
                        }
                    }
                    
                    Label_1149:
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1430)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(8)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(-1433534813))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_1032)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_613 = and:int(var_3_613:int, ldc:int(103054856))
                            goto(Label_0879)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(512)), ldc:int(0))) {
                            var_3_613 = and:int(var_3_613:int, ldc:int(125052943))
                            goto(Label_0779)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_613 = and:int(var_3_613:int, ldc:int(895009593))
                            goto(Label_0661)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0552)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_613 = and:int(var_3_613:int, ldc:int(1832367637))
                            goto(Label_0394)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_613 = and:int(var_3_613:int, ldc:int(-2052196743))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10A:double, var_5_80:int, var_16_10E:int)
                            goto(Label_1419)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1288:
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1430)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1149)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(749326231))
                        goto(Label_1032)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0879)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0779)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(8)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(-1852722122))
                        goto(Label_0661)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(-404219663))
                        goto(Label_0552)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(1168299278))
                        goto(Label_0394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(8192)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_613 = and:int(var_3_613:int, ldc:int(1525019739))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10A:double, ldc:double(0.0))
                    Label_1419:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_61E = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E0:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1430:
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(-338887833))
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1149)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(512)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(-1002259118))
                        goto(Label_1032)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(-1081742121))
                        goto(Label_0879)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(-445916661))
                        goto(Label_0779)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(8)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(1395517682))
                        goto(Label_0661)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0552)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(128)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(963394234))
                        goto(Label_0394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(512)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(1845220765))
                        var_17_61E = add:int(var_16_10E:int, xor:int(ldc:int(2186), ldc:int(2187)))
                        looporswitchbreak()
                    }
                }
                
                var_3_613 = and:int(var_3_613:int, ldc:int(2023855711))
                
                if (cmple:boolean(var_5_80 = var_17_61E:int, sub:int(var_6_87:int, xor:int(ldc:int(28680), ldc:int(28681))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(8)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
