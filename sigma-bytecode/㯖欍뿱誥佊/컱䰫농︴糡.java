public final class \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\ucef1\u4c2b\ub18d\ufe34\u7ce1 {
    public void \ucef1\u4c2b\ub18d\ufe34\u7ce1(int p0, float p1) {
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
            invokespecial:Object(Object::<init>, this:\ucef1\u4c2b\ub18d\ufe34\u7ce1)
            putfield:int(\ucef1\u4c2b\ub18d\ufe34\u7ce1::\ud158\ubcb0\u61a4\uf995\u3bc9\uceb8, this:\ucef1\u4c2b\ub18d\ufe34\u7ce1, p0:int)
            putfield:float(\ucef1\u4c2b\ub18d\ufe34\u7ce1::\u0a06\u4daf\ub83f\uae5d\u16f6\u6bb9, this:\ucef1\u4c2b\ub18d\ufe34\u7ce1, p1:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u527a\u61a4\u16f6\u7006\uc87f\u965f(java.util.Random p0, int p1, int p2) {
        var_4_61 : int
        var_6_6A : int
        
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
            var_4_61 = and:int(ldc:int(1848035506), ldc:int(-1138374182))
            var_6_6A = and:int(ldc:int(25488), ldc:int(-25489))
            
            loop {
                if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(536870912)), ldc:int(0))) {
                    var_4_61 = and:int(var_4_61:int, ldc:int(-732293819))
                }
                else {
                    var_4_61 = and:int(var_4_61:int, ldc:int(1844739144))
                    
                    if (cmplt:boolean(var_6_6A:int, add:int(p2:int, getfield:int(\ucef1\u4c2b\ub18d\ufe34\u7ce1::\ud158\ubcb0\u61a4\uf995\u3bc9\uceb8, this:\ucef1\u4c2b\ub18d\ufe34\u7ce1)))) {
                        if (cmplt:boolean(invokevirtual:float(Random::nextFloat, p0:Random), getfield:float(\ucef1\u4c2b\ub18d\ufe34\u7ce1::\u0a06\u4daf\ub83f\uae5d\u16f6\u6bb9, this:\ucef1\u4c2b\ub18d\ufe34\u7ce1))) {
                            inc:int(p1, ldc:int(1))
                        }
                        
                        var_4_61 = and:int(var_4_61:int, ldc:int(-298131818))
                        inc:int(var_6_6A, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(1024)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:int(p1:int)
        }
        
        goto(Label_0006)
    }
    
    public void \u47c2\u76bc\u3776\ud36e\uf94d\u5fe1(com.google.gson.JsonObject p0, com.google.gson.JsonSerializationContext p1) {
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
            invokevirtual:void(JsonObject::addProperty, p0:JsonObject, loadelement:String(getstatic:String[](\ucef1\u4c2b\ub18d\ufe34\u7ce1::\u5245\uceb8\ua3b4\u7c6b\u8bb0\u51b2), and:int(ldc:int(-28075), ldc:int(27818))), invokestatic:Integer[expected:Number](Integer::valueOf, getfield:int(\ucef1\u4c2b\ub18d\ufe34\u7ce1::\ud158\ubcb0\u61a4\uf995\u3bc9\uceb8, this:\ucef1\u4c2b\ub18d\ufe34\u7ce1)))
            invokevirtual:void(JsonObject::addProperty, p0:JsonObject, loadelement:String(getstatic:String[](\ucef1\u4c2b\ub18d\ufe34\u7ce1::\u5245\uceb8\ua3b4\u7c6b\u8bb0\u51b2), and:int(ldc:int(21185), ldc:int(10257))), invokestatic:Float[expected:Number](Float::valueOf, getfield:float(\ucef1\u4c2b\ub18d\ufe34\u7ce1::\u0a06\u4daf\ub83f\uae5d\u16f6\u6bb9, this:\ucef1\u4c2b\ub18d\ufe34\u7ce1)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u8aa5\u4179\u183a\ua6bd\uc9f6 \u2dcc\uc246\u16f6\u98a4\u3bd6\u67d0(com.google.gson.JsonObject p0, com.google.gson.JsonDeserializationContext p1) {
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
            return:\u8aa5\u4179\u183a\ua6bd\uc9f6(initobject:\ucef1\u4c2b\ub18d\ufe34\u7ce1[expected:\u8aa5\u4179\u183a\ua6bd\uc9f6](\ucef1\u4c2b\ub18d\ufe34\u7ce1::<init>, invokestatic:int(\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\u4e72\u4f4a\u6c52\u446c\u97b7\uae5d, p0:JsonObject, loadelement:String(getstatic:String[](\ucef1\u4c2b\ub18d\ufe34\u7ce1::\u5245\uceb8\ua3b4\u7c6b\u8bb0\u51b2), and:int(ldc:int(-16548), ldc:int(16547)))), invokestatic:float(\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\u5245\u624e\u93a2\u3c25\u759a\ud4fe, p0:JsonObject, loadelement:String(getstatic:String[](\ucef1\u4c2b\ub18d\ufe34\u7ce1::\u5245\uceb8\ua3b4\u7c6b\u8bb0\u51b2), and:int(ldc:int(3449), ldc:int(641))))))
        }
        
        goto(Label_0006)
    }
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 \u88c5\u873d\uc29a\ua3b4\uf94d\u69d9() {
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
            return:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ucef1\u4c2b\ub18d\ufe34\u7ce1::\u9937\u4bc8\u36d3\u6198\u3d64\u760c))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_285 : int
        expr_6B : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_C3_0 : byte[] [generated]
        stack_FC_0 : byte[] [generated]
        stack_FE_0 : byte[] [generated]
        stack_12E_0 : byte[] [generated]
        stack_1E3_0 : byte[] [generated]
        stack_233_0 : byte[] [generated]
        stack_29E_0 : byte[] [generated]
        stack_2FC_0 : byte[] [generated]
        var_4_1BF : int
        var_3_1C4 : byte[]
        var_5_1C5 : int
        expr_1E3 : byte [generated]
        var_0_2F2 : int
        expr_2FC : byte [generated]
        stack_32A_2 : byte [generated]
        var_2_94 : byte[]
        expr_98 : int [generated]
        var_3_222 : byte[]
        var_5_223 : int
        expr_C3 : int [generated]
        expr_FE : int [generated]
        var_3_13A : String
        expr_142 : String[] [generated]
        expr_14C : String[] [generated]
        
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
        var_0_285 = and:int(ldc:int(-1411876720), ldc:int(-1453368615))
        expr_6B = arraylength:int(stack_94_0 = stack_96_0 = stack_C1_0 = stack_C3_0 = stack_FC_0 = stack_FE_0 = stack_12E_0 = stack_1E3_0 = stack_233_0 = stack_29E_0 = stack_2FC_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("sLWpi7KGsa25ubK/i7G6u7q9s7uMv7+nuYanraS1u7OwgJgSHhcQBwgH")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1BF = expr_6B:int
        var_3_1C4 = newarray:byte[](byte.class, expr_6B:int)
        var_5_1C5 = expr_6B:int
        Label_0455:
        
        while (cmpeq:boolean(and:int(var_0_285:int, ldc:int(1)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_285:int, ldc:int(2048)), ldc:int(0))) {
                goto(Label_0634)
            }
            
            var_0_285 = and:int(var_0_285:int, ldc:int(-109125897))
            var_5_1C5 = add:int(var_5_1C5:int, ldc:int(-1))
            expr_1E3 = loadelement:byte(stack_1E3_0:byte[], var_5_1C5:int)
            storeelement:byte(var_3_1C4:byte[], var_5_1C5:int, or:int(and:int(shl:int(expr_1E3:byte, xor:int(ldc:int(-23549), ldc:int(-23545))), ldc:int(-16)), and:int(shr:int(expr_1E3:byte[expected:int], and:int(ldc:int(8260), ldc:int(6956))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_1C5:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C1_0 = stack_C3_0 = stack_FC_0 = stack_FE_0 = stack_12E_0 = stack_1E3_0 = stack_233_0 = stack_29E_0 = stack_2FC_0 = var_3_1C4:byte[]
            goto(Label_0112)
        }
        
        goto(Label_0720)
        Label_0634:
        
        while (cmpeq:boolean(and:int(var_0_285:int, ldc:int(32)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_285:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_0455)
            }
            
            var_0_285 = and:int(var_0_285:int, ldc:int(-310436840))
            var_5_1C5 = add:int(var_5_1C5:int, ldc:int(-1))
            storeelement:byte(var_3_1C4:byte[], var_5_1C5:int, add:byte(xor:byte(loadelement:byte(stack_29E_0:byte[], var_5_1C5:int), ldc:byte(29)), ldc:byte(89)))
            
            if (cmpne:boolean(var_5_1C5:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C1_0 = stack_C3_0 = stack_FC_0 = stack_FE_0 = stack_12E_0 = stack_1E3_0 = stack_233_0 = stack_29E_0 = stack_2FC_0 = var_3_1C4:byte[]
            goto(Label_0200)
        }
        
        var_0_285 = and:int(var_0_285:int, ldc:int(164325790))
        Label_0720:
        
        while (cmpne:boolean(and:int(var_0_285:int, ldc:int(524288)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_285:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_285 = and:int(var_0_285:int, ldc:int(-1869217072))
                goto(Label_0455)
            }
            
            var_0_2F2 = and:int(var_0_285:int, ldc:int(-1409778759))
            var_5_1C5 = add:int(var_5_1C5:int, ldc:int(-1))
            expr_2FC = loadelement:byte(stack_2FC_0:byte[], var_5_1C5:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_1C5:int, ldc:int(6)), neg:int(var_4_1BF:int)), ldc:int(0))) {
                var_0_2F2 = and:int(var_0_2F2:int, ldc:int(-1109533926))
                stack_32A_2 = add:byte(expr_2FC:byte, ldc:byte(6))
            }
            else {
                stack_32A_2 = add:byte(expr_2FC:byte, loadelement:byte(var_3_1C4:byte[], add:int(var_5_1C5:int, ldc:int(6))))
            }
            
            var_0_285 = and:int(var_0_2F2:int, ldc:int(-1451720802))
            storeelement:byte(var_3_1C4:byte[], var_5_1C5:int, stack_32A_2:byte)
            
            if (cmpne:boolean(var_5_1C5:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C1_0 = stack_C3_0 = stack_FC_0 = stack_FE_0 = stack_12E_0 = stack_1E3_0 = stack_233_0 = stack_29E_0 = stack_2FC_0 = var_3_1C4:byte[]
            goto(Label_0259)
        }
        
        var_0_285 = and:int(var_0_285:int, ldc:int(-87277277))
        goto(Label_0634)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_285:int, ldc:int(2048)), ldc:int(0))) {
            goto(Label_0259)
        }
        
        if (cmpne:boolean(and:int(var_0_285:int, ldc:int(512)), ldc:int(0))) {
            goto(Label_0200)
        }
        
        if (cmpeq:boolean(and:int(var_0_285:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_285 = and:int(var_0_285:int, ldc:int(277674348))
        }
        else {
            var_0_285 = and:int(var_0_285:int, ldc:int(-337797772))
            var_2_94 = stack_94_0:byte[]
            expr_98 = add:int(arraylength:int(stack_96_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_98:int, ldc:int(0))) {
                var_3_222 = newarray:byte[](byte.class, expr_98:int)
                var_5_223 = expr_98:int
                
                loop {
                    var_0_285 = and:int(var_0_285:int, ldc:int(-1417789863))
                    var_5_223 = add:int(var_5_223:int, ldc:int(-1))
                    storeelement:byte(var_3_222:byte[], var_5_223:int, add:int(shl:int(loadelement:byte(stack_233_0:byte[], var_5_223:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_94:byte[], add:int(var_5_223:int, xor:int(ldc:int(20994), ldc:int(20995)))), ldc:int(4)), and:int(ldc:int(9231), ldc:int(4143)))))
                    
                    if (cmpne:boolean(var_5_223:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_C1_0 = stack_C3_0 = stack_FC_0 = stack_FE_0 = stack_12E_0 = stack_1E3_0 = stack_233_0 = stack_29E_0 = stack_2FC_0 = var_3_222:byte[]
            }
        }
        
        Label_0157:
        
        if (cmpeq:boolean(and:int(var_0_285:int, ldc:int(4194304)), ldc:int(0))) {
            goto(Label_0259)
        }
        
        if (cmpeq:boolean(and:int(var_0_285:int, ldc:int(131072)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_285:int, ldc:int(512)), ldc:int(0))) {
                var_0_285 = and:int(var_0_285:int, ldc:int(-1280500850))
                goto(Label_0112)
            }
            
            var_0_285 = and:int(var_0_285:int, ldc:int(-516208))
            expr_C3 = arraylength:int(stack_C3_0:byte[])
            
            if (cmpne:boolean(expr_C3:int, ldc:int(0))) {
                var_4_1BF = expr_C3:int
                var_3_1C4 = newarray:byte[](byte.class, expr_C3:int)
                var_5_1C5 = expr_C3:int
                goto(Label_0634)
            }
        }
        
        Label_0200:
        
        if (cmpne:boolean(and:int(var_0_285:int, ldc:int(32)), ldc:int(0))) {
            var_0_285 = and:int(var_0_285:int, ldc:int(-1348927509))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_285:int, ldc:int(2048)), ldc:int(0))) {
                var_0_285 = and:int(var_0_285:int, ldc:int(1752776843))
                goto(Label_0157)
            }
            
            if (cmpeq:boolean(and:int(var_0_285:int, ldc:int(16)), ldc:int(0))) {
                var_0_285 = and:int(var_0_285:int, ldc:int(1478410312))
                goto(Label_0112)
            }
            
            var_0_285 = and:int(var_0_285:int, ldc:int(-8480363))
            expr_FE = arraylength:int(stack_FE_0:byte[])
            
            if (cmpne:boolean(expr_FE:int, ldc:int(0))) {
                var_4_1BF = expr_FE:int
                var_3_1C4 = newarray:byte[](byte.class, expr_FE:int)
                var_5_1C5 = expr_FE:int
                goto(Label_0720)
            }
        }
        
        Label_0259:
        
        if (cmpne:boolean(and:int(var_0_285:int, ldc:int(32)), ldc:int(0))) {
            goto(Label_0200)
        }
        
        if (cmpne:boolean(and:int(var_0_285:int, ldc:int(1)), ldc:int(0))) {
            var_0_285 = and:int(var_0_285:int, ldc:int(-694049156))
            goto(Label_0157)
        }
        
        if (cmpne:boolean(and:int(var_0_285:int, ldc:int(131072)), ldc:int(0))) {
            var_0_285 = and:int(var_0_285:int, ldc:int(-918028259))
            goto(Label_0112)
        }
        
        var_3_13A = initobject:String(String::<init>, stack_12E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        expr_142 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(6323), ldc:int(16647)))
        expr_14C = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(4099), ldc:int(2071)))
        storeelement:String(expr_142:String[], xor:int(ldc:int(-30192), ldc:int(-30190)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(-30162), ldc:int(29136)), and:int(ldc:int(2073), ldc:int(25))))
        storeelement:String(expr_14C:String[], and:int(ldc:int(-8673), ldc:int(8672)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, xor:int(ldc:int(7), ldc:int(30)), and:int(ldc:int(18462), ldc:int(798))))
        storeelement:String(expr_14C:String[], and:int(ldc:int(2241), ldc:int(8725)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(6558), ldc:int(9278)), and:int(ldc:int(2093), ldc:int(17065))))
        putstatic:String[](\ucef1\u4c2b\ub18d\ufe34\u7ce1::\u5245\uceb8\ua3b4\u7c6b\u8bb0\u51b2, expr_14C:String[])
        putstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ucef1\u4c2b\ub18d\ufe34\u7ce1::\u9937\u4bc8\u36d3\u6198\u3d64\u760c, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, loadelement:String(expr_142:String[], and:int(ldc:int(10254), ldc:int(3)))))
    }
    
    public void \u64ab\ucfaf\u69d9\u3d64\u76bc\u416d(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_639 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_644 : int
        
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
        var_3_639 = and:int(ldc:int(-251200554), ldc:int(-282690690))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ucef1\u4c2b\ub18d\ufe34\u7ce1[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(512)), ldc:int(0))) {
            var_3_639 = and:int(var_3_639:int, ldc:int(-446923921))
            var_5_7D = and:int(ldc:int(29636), ldc:int(-29677))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(26634), ldc:int(-26891)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_639:int, ldc:int(1762534337))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(9233), ldc:int(9232)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(16897), ldc:int(39)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_639 = and:int(var_3_D2:int, ldc:int(1740946257))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(257), ldc:int(256)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1505)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1363)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(1847826374))
                        goto(Label_1240)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1118)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-1331660477))
                        goto(Label_0936)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0817)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0701)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-293734410))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-893301324))
                    }
                    else {
                        var_3_639 = and:int(var_3_639:int, ldc:int(2104861660))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0817)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(32)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(2068557144))
                        goto(Label_1505)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(64)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(2146744689))
                        goto(Label_1363)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(1912389663))
                        goto(Label_1240)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1118)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(2032235723))
                        goto(Label_0936)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0817)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(1604620936))
                        goto(Label_0701)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(-1380573663))
                            loopcontinue()
                        }
                        
                        var_3_639 = and:int(var_3_639:int, ldc:int(-480297106))
                        var_11_E3 = and:int(ldc:int(5251), ldc:int(-5252))
                        goto(Label_1494)
                    }
                    
                    Label_0557:
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(493898384))
                        goto(Label_1505)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1363)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(32)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(1254858245))
                        goto(Label_1240)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(1651528397))
                        goto(Label_1118)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(256)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(340652109))
                        goto(Label_0936)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0817)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(1047313426))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(256)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(380782076))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(2065965804))
                            loopcontinue()
                        }
                        
                        var_3_639 = and:int(var_3_639:int, ldc:int(1905012551))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0817)
                        }
                    }
                    
                    Label_0701:
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1505)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-542920763))
                        goto(Label_1363)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1240)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1118)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0936)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-689808939))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(364745028))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_639 = and:int(var_3_639:int, ldc:int(2034579392))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0817:
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(32)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-31473040))
                        goto(Label_1505)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1363)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1240)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1118)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(803232895))
                            goto(Label_0701)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(32)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(-2025238885))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(-968794195))
                            loopcontinue()
                        }
                        
                        var_3_639 = and:int(var_3_639:int, ldc:int(1797632869))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:boolean(0), ldc:boolean(1))
                                goto(Label_1118)
                            }
                        }
                    }
                    
                    Label_0936:
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1505)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(8)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(1680158622))
                        goto(Label_1363)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(1)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-2083732593))
                        goto(Label_1240)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(-874237613))
                            goto(Label_0817)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(-1545868001))
                            goto(Label_0701)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(-601380805))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(-349643737))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(101247737))
                            loopcontinue()
                        }
                        
                        var_3_639 = and:int(var_3_639:int, ldc:int(1643587582))
                        var_11_E3 = and:int(ldc:int(-13164), ldc:int(8801))
                    }
                    
                    Label_1118:
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1505)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1363)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(986237600))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0936)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(32)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(1262080302))
                            goto(Label_0817)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0701)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(8)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(-1208375539))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(582350636))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_639 = and:int(var_3_639:int, ldc:int(-213095442))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1363)
                            }
                        }
                    }
                    
                    Label_1240:
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(2074634316))
                        goto(Label_1505)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_1118)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(202077553))
                            goto(Label_0936)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0817)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0701)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(8)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(-1058402007))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(1800811472))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1494)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1363:
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1505)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1240)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1118)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(1319515312))
                        goto(Label_0936)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0817)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(1366297914))
                        goto(Label_0701)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(1654727921))
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(32)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(543752759))
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(512)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_639 = and:int(var_3_639:int, ldc:int(-309395458))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1494:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_644 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1505:
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1363)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1240)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1118)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(450415604))
                        goto(Label_0936)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(965991262))
                        goto(Label_0817)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0701)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(1878915921))
                        var_17_644 = add:int(var_16_111:int, and:int(ldc:int(1601), ldc:int(8485)))
                        looporswitchbreak()
                    }
                }
                
                var_3_639 = and:int(var_3_639:int, ldc:int(2032614236))
                
                if (cmple:boolean(var_5_7D = var_17_644:int, sub:int(var_6_84:int, and:int(ldc:int(841), ldc:int(8321))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(1)), ldc:int(0))) {
            var_3_639 = and:int(var_3_639:int, ldc:int(1498019662))
            goto(Label_0106)
        }
    }
}
